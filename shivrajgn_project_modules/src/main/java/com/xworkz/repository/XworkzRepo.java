package com.xworkz.repository;

import com.xworkz.entity.XworkzEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface XworkzRepo {
    boolean validData(XworkzEntity xworkzEntity);
    String findByEmail(String email);

    int getCount(String email);

    void updateCountt(String email);

    boolean emailExist(String email);
}
