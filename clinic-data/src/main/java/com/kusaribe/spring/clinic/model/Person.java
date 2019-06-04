package com.kusaribe.spring.clinic.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


@Getter
@Setter

@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

}

