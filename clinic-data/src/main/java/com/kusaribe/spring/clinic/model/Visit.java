package com.kusaribe.spring.clinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name="visit")
public class Visit extends BaseEntity{

    @Column(name="date")
    private LocalDate date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="pet_id")
    private Pet pet;

    @Column(name="description")
    private String description;

}
