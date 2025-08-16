package com.wipro.employeemngnt.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

    @Enumerated(EnumType.STRING)
    private EmployeeType employeeType;

    @ManyToOne
    private Department department;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public enum EmployeeType {
        REGULAR, CONTRACT
    }
}
