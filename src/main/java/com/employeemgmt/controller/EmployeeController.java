
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


    @PutMapping("/{id}")
    public Employee update(@PathVariable(name = "id") Long id, @RequestBody Employee emp) {
        return service.updateEmployee(id, emp);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        service.deleteEmployee(id);
    }


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

