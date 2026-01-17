package com.xworkz.repository;

import com.xworkz.entity.XworkzEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface XworkzRepo {
    boolean validData(XworkzEntity xworkzEntity);
    XworkzEntity findByEmail(String email);
}
