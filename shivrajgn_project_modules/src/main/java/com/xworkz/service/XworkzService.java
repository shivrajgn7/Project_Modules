package com.xworkz.service;

import com.xworkz.dto.XworkzDto;
import com.xworkz.entity.XworkzEntity;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.util.Optional;

public interface XworkzService {

    boolean validateAndSave(XworkzDto xworkzDto);

    boolean validateLoginAndGetUser(String email, String password);

    int getCount(String email);

    void updateCount(String email);

    boolean emailExist(String email);
}
