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
        @NamedQuery(name ="findByEmail", query = "SELECT s FROM xbase s WHERE s.email = :email")
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
}
