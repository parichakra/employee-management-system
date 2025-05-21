//package com.employeemgmt.service;
//
//
//import com.employeemgmt.service.EmployeeService;
//import com.employeemgmt.entity.Employee;
//import com.employeemgmt.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Override
//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }
//
//    @Override
//    public List<Employee> searchAndFilterEmployees(String searchText, String department, Double minSalary, Double maxSalary) {
//        return employeeRepository.findAll().stream()
//                .filter(e -> (searchText == null || e.getName().toLowerCase().contains(searchText.toLowerCase())))
//                .filter(e -> (department == null || e.getDepartment().equalsIgnoreCase(department)))
//                .filter(e -> (minSalary == null || e.getSalary() >= minSalary))
//                .filter(e -> (maxSalary == null || e.getSalary() <= maxSalary))
//                .collect(Collectors.toList());
//    }
//}
