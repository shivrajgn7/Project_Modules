package com.xworkz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name="xbase")
@NamedQueries({
        @NamedQuery(name ="findByEmail", query = "SELECT s.password FROM XworkzEntity s WHERE s.email = :em"),
        @NamedQuery(name = "getCount", query = "SELECT s.countt FROM XworkzEntity s WHERE s.email=:yh" ),
        @NamedQuery(name = "updateCount" , query = "UPDATE XworkzEntity s SET s.countt = s.countt + 1 WHERE s.email = :up"),
        @NamedQuery(name = "emailExist", query = "select 1 from XworkzEntity user where user.email=:em")
})
public class XworkzEntity {
    @Id
 //   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name="email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name="phNumber")
    private long phoneNumber;

    @Column(name="address")
    private String address;

//@Column(name="zipcode")
//private long zipCode;

    @Column(name="age")
    private int age;

    @Column(name="gender")
    private String gender;

    @Column(name="countt")
    private int countt;
}
