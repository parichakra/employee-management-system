package com.employeemgmt.service;

//import com.employeemgmt.entity.Employee;
//import com.employeemgmt.repository.EmployeeRepository;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//
//
//import jakarta.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Propagation;
//
//
//
//@Service
//public class EmployeeService {
//	
//	public final EmployeeRepository employeeRepository;
//	
//	 public EmployeeService(EmployeeRepository repository) {
//       this.employeeRepository = repository;
//	 }
//	 
//
//	public Employee addEmployee(Employee employee) {
//	   return employeeRepository.save(employee);
//	}
//	
//	public List<Employee> getAllEmployees() {
//	   return employeeRepository.findAll();
//	}
//	
//  public Employee updateEmployee(Long id, Employee updatedEmpData) {
//	  Employee emp = employeeRepository.findById(id).orElseThrow();
//	  emp.setName(updatedEmpData.getName());
//	  emp.setDepartment(updatedEmpData.getDepartment());
//	  emp.setSalary(updatedEmpData.getSalary());
//	  return employeeRepository.save(emp);
//  }
//  
//  
//	public void deleteEmployee(Long id) {
//	employeeRepository.deleteById(id);
//	}
//	
//	
//	public List<Employee> searchEmployee(String searchText) {
//	    searchText = '%'+searchText +'%';
//	    return employeeRepository.findEmployeeBySearchText(searchText);
//	}
//	
//	
//
//}




//package com.employeemgmt.service;

import com.employeemgmt.entity.Employee;
import com.employeemgmt.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository repository) {
        this.employeeRepository = repository;
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Long id, Employee updatedEmpData) {
        Employee emp = employeeRepository.findById(id).orElseThrow();
        emp.setName(updatedEmpData.getName());
        emp.setDepartment(updatedEmpData.getDepartment());
        emp.setSalary(updatedEmpData.getSalary());
        return employeeRepository.save(emp);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }


    
    public List<Employee> searchEmployee(String searchText) {
        return employeeRepository.findEmployeeBySearchText(searchText);
        
    }
    
    // ✅ New: Filter by department and optional min/max salary
    public List<Employee> filterEmployees(String department, Double minSalary, Double maxSalary) {
        return employeeRepository.filterEmployees(department, minSalary, maxSalary);
    }

}
