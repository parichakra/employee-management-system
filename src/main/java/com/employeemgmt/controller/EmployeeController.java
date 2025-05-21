//package com.employeemgmt.controller;
////
////
////
////import com.employeemgmt.entity.Employee;
////
////import com.employeemgmt.service.EmployeeService;
////
////import org.springframework.http.ResponseEntity;
////import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.web.bind.annotation.PathVariable;
////import org.springframework.web.bind.annotation.PostMapping;
////import org.springframework.web.bind.annotation.PutMapping;
////import org.springframework.web.bind.annotation.RequestBody;
////import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.bind.annotation.RestController;
////import java.util.*;
////
////
////@RestController
////@RequestMapping("api/employee")
////public class EmployeeController {
////	
////    private final EmployeeService service;
////
////    public EmployeeController(EmployeeService service) {
////        this.service = service;
////    }
////
////    @PostMapping("/insert")
////    public Employee add(@RequestBody Employee emp) {
////        return service.addEmployee(emp);
////    }
////
////    @GetMapping
////    public List<Employee> list() {
////        return service.getAllEmployees();
////    }
////
////    @PutMapping("/{id}")
////    public Employee update(@PathVariable Long id, @RequestBody Employee emp) {
////        return service.updateEmployee(id, emp);
////    }
////
////    @GetMapping("/{id}")
////    public void delete(@PathVariable Long id) {
////        service.deleteEmployee(id);
////    }
////    
////
////    @GetMapping("/search")
////    public ResponseEntity<List<Employee>> searchEmployee(@RequestParam String searchText){
////    	List<Employee> foundEmployee = service.searchEmployee(searchText);
////    	
////    	if(!foundEmployee.isEmpty()) {
////    		return ResponseEntity.ok(foundEmployee);
////    	} else {
////    		return ResponseEntity.noContent().build();
////    	}
////    }
////}
//
//
////package com.app.employeemgmt.controller;
//
//import com.employeemgmt.entity.Employee;
//import com.employeemgmt.service.EmployeeService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/employees")
//public class EmployeeController {
//
//    private final EmployeeService service;
//
//    public EmployeeController(EmployeeService service) {
//        this.service = service;
//    }
//
//    @PostMapping
//    public Employee add(@RequestBody Employee emp) {
//        return service.addEmployee(emp);
//    }
//
//    @GetMapping
//    public List<Employee> list() {
//        return service.getAllEmployees();
//    }
//
//    @PutMapping("/{id}")
//    public Employee update(@PathVariable Long id, @RequestBody Employee emp) {
//        return service.updateEmployee(id, emp);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id) {
//        service.deleteEmployee(id);
//    }
//
////    @GetMapping("/search")
////    public ResponseEntity<List<Employee>> searchEmployee(@RequestParam String searchText) {
////        List<Employee> foundEmployee = service.searchEmployee(searchText);
////        return foundEmployee.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(foundEmployee);
////    }
//    
////    @GetMapping("/search")
////    public ResponseEntity<List<Employee>> searchEmployee(@RequestParam String searchText) {
////        List<Employee> results = service.searchEmployee(searchText);
////        
////        if (results.isEmpty()) {
////            return ResponseEntity.noContent().build();
////        } else {
////            return ResponseEntity.ok(results);
////        }
//    
//    
//    	
//    @GetMapping("/search")
//    public ResponseEntity<List<Employee>> searchEmployee(@RequestParam("searchText") String searchText) {
//        List<Employee> results = service.searchEmployee(searchText);
//        
//        if (results.isEmpty()) {
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.ok(results);
//        }
//    }
//    
//    
//    @GetMapping("/filter")
//    public ResponseEntity<List<Employee>> filterEmployees(
//            @RequestParam(name = "department", required = false) String department,
//            @RequestParam(name = "minSalary", required = false) Double minSalary,
//            @RequestParam(name = "maxSalary", required = false) Double maxSalary) {
//
//        List<Employee> results = service.filterEmployees(department, minSalary, maxSalary);
//
//        if (results.isEmpty()) {
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.ok(results);
//        }
//    }
//
//
//}
//





//
//package com.employeemgmt.controller;
//
//import com.employeemgmt.entity.Employee;
//import com.employeemgmt.service.EmployeeService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/employees")
//public class EmployeeController {
//
//    private final EmployeeService service;
//
//    public EmployeeController(EmployeeService service) {
//        this.service = service;
//    }
//
//    @PostMapping
//    public ResponseEntity<Employee> add(@RequestBody Employee emp) {
//        Employee saved = service.addEmployee(emp);
//        return ResponseEntity.ok(saved);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Employee>> list() {
//        List<Employee> employees = service.getAllEmployees();
//        return ResponseEntity.ok(employees);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Employee> update(@PathVariable("id") Long id, @RequestBody Employee emp) {
//        Employee updated = service.updateEmployee(id, emp);
//        return ResponseEntity.ok(updated);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
//        service.deleteEmployee(id);
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping("/search")
//    public ResponseEntity<List<Employee>> searchEmployee(
//            @RequestParam(name = "searchText") String searchText) {
//
//        List<Employee> results = service.searchEmployee(searchText);
//        return results.isEmpty()
//                ? ResponseEntity.noContent().build()
//                : ResponseEntity.ok(results);
//    }
//
//    @GetMapping("/filter")
//    public ResponseEntity<List<Employee>> filterEmployees(
//            @RequestParam(name = "department", required = false) String department,
//            @RequestParam(name = "minSalary", required = false) Double minSalary,
//            @RequestParam(name = "maxSalary", required = false) Double maxSalary) {
//
//        List<Employee> results = service.filterEmployees(department, minSalary, maxSalary);
//        return results.isEmpty()
//                ? ResponseEntity.noContent().build()
//                : ResponseEntity.ok(results);
//    }
//}



package com.employeemgmt.controller;

import com.employeemgmt.entity.Employee;
import com.employeemgmt.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public Employee add(@RequestBody Employee emp) {
        return service.addEmployee(emp);
    }

    @GetMapping
    public List<Employee> list() {
        return service.getAllEmployees();
    }

    // ✅ Added name = "id"
    @PutMapping("/{id}")
    public Employee update(@PathVariable(name = "id") Long id, @RequestBody Employee emp) {
        return service.updateEmployee(id, emp);
    }

    // ✅ Added name = "id"
    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        service.deleteEmployee(id);
    }

    // ✅ Added name = "searchText"
    @GetMapping("/search")
    public ResponseEntity<List<Employee>> searchEmployee(
            @RequestParam(name = "searchText") String searchText) {

        List<Employee> results = service.searchEmployee(searchText);

        if (results.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(results);
        }
    }

    // ✅ Already correct — kept for clarity
    @GetMapping("/filter")
    public ResponseEntity<List<Employee>> filterEmployees(
            @RequestParam(name = "department", required = false) String department,
            @RequestParam(name = "minSalary", required = false) Double minSalary,
            @RequestParam(name = "maxSalary", required = false) Double maxSalary) {

        List<Employee> results = service.filterEmployees(department, minSalary, maxSalary);

        if (results.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(results);
        }
    }
}

