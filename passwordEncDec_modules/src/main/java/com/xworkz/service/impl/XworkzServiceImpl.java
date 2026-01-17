
// java
        package com.xworkz.service.impl;

import com.xworkz.dto.XworkzDto;
import com.xworkz.entity.XworkzEntity;
import com.xworkz.repository.XworkzRepo;
import com.xworkz.service.XworkzService;
import org.hibernate.id.uuid.StandardRandomStrategy;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Optional;

@Service
public class XworkzServiceImpl implements XworkzService {
@Autowired
    private final XworkzRepo xworkzRepo;

    @Autowired
    public XworkzServiceImpl(XworkzRepo xworkzRepo) {
        this.xworkzRepo = xworkzRepo;
    }
    private static final String SECRET_KEY="0123456789abcdef";
    private static final String ALGORITHM="AES/ECB/PKCS5Padding";
    private static final String CHARSET= StandardCharsets.UTF_8.name();

    private String encrypt(String plain) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            byte[] encrypted = cipher.doFinal(plain.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception e) {
            System.err.println("Encryption error: " + e.getMessage());
            return null;
        }
    }

    private String decrypt(String encryptedBase64) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            byte[] decoded = Base64.getDecoder().decode(encryptedBase64);
            byte[] plain = cipher.doFinal(decoded);
            return new String(plain, StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.err.println("Decryption error: " + e.getMessage());
            return null;
        }
    }
    @Override
    public boolean validateAndSave(XworkzDto xworkzDto) {
        if (xworkzDto == null) {
            System.out.println("validation failed: dto is null");
            return false;
        }

        // Basic validation - adjust fields as needed
        if (xworkzDto.getName() == null || xworkzDto.getName().trim().isEmpty()) {
            System.out.println("validation failed: name is required");
            return false;
        }

        System.out.println("Data is started"+ xworkzDto);
        XworkzEntity xworkzEntity = new XworkzEntity();
        BeanUtils.copyProperties(xworkzDto, xworkzEntity);

        // encrypt password before saving
        String plainPwd = xworkzDto.getPassword();
        if (plainPwd != null) {
            String enc = encrypt(plainPwd);
            if (enc == null) {
                System.out.println("validation failed: password encryption error");
                return false;
            }
            xworkzEntity.setPassword(enc);
        }

        boolean saved = xworkzRepo.validData(xworkzEntity);
        System.out.println("Saved result: " + saved);
        return saved;
    }

    @Override
    public XworkzDto validateLoginAndGetUser(String email, String password) {
        System.out.println("service is stareted");
        if (email == null || password == null) return null;

        XworkzEntity entity = xworkzRepo.findByEmail(email);
        if (entity == null) return null;

        String decrypted = decrypt(entity.getPassword());
        if (!decrypted.equals(password)) return null;

        XworkzDto dto = new XworkzDto();
        BeanUtils.copyProperties(entity, dto);
        System.out.println("service is endded");

        return dto;
    }
}
