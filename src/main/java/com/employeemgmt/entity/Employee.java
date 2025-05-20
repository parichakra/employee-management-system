//package com.employeemgmt.entity;
//
//
////import jakarta.persistence.*;
////import lombok.*;
////
////@Entity
////@Data
////@NoArgsConstructor
////@AllArgsConstructor
////public class Employee {
////    
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    private Long id;
////
////    private String name;
////    private String email;
////    private String department;
////    private Double salary;
////}
//
////package com.example.employeemanagement.model;
//
//import jakarta.persistence.*;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity(name = "employee_table")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//public class Employee {
//	private static Employee instance;
//
//	public static Employee getInstance() {
//		if (instance == null) {
//			instance = new Employee();
//		}
//		return instance;
//	}
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//
//	private String name;
//
//	private String department;
//
//	private double salary;
//	
//	private String searchText;
//	
////	private String designation;
//
//}



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

