package com.xworkz.service;

import com.xworkz.dto.XworkzDto;
import com.xworkz.entity.XworkzEntity;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.util.Optional;

public interface XworkzService {

    boolean validateAndSave(XworkzDto xworkzDto);

    XworkzDto validateLoginAndGetUser(String email, String password);

}
