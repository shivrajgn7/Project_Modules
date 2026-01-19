package com.xworkz.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class XworkzDto {

    private int id;

    @NotNull
    @Size(min =3)
    private String name;

    private String email;

    private String password;

    private long phoneNumber;

    private String address;

    //private long zipCode;

    private int age;

    private String gender;

}
