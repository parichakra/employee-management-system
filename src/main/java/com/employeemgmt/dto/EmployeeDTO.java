package com.employeemgmt.dto;


//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class EmployeeDTO {
//
//	private String name;
//
//	private String department;
//
//	private double salary;
//	
//	private String searchText;
//
//
//}



import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private String name;
    private String department;
    private double salary;
    private String searchText; // only needed if using DTO for input
}
