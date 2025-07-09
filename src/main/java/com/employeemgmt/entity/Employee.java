
package com.employeemgmt.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "employee_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String department;

    private double salary;
}

