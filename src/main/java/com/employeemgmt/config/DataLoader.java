package com.employeemgmt.config;


import com.employeemgmt.entity.Employee;
import com.employeemgmt.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public DataLoader(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) {
        employeeRepository.save(Employee.builder().name("Ram").department("IT").salary(20000).build());
        employeeRepository.save(Employee.builder().name("Shyam").department("CS").salary(20000).build());
        employeeRepository.save(Employee.builder().name("Hari").department("IT").salary(20000).build());
        employeeRepository.save(Employee.builder().name("Abc").department("Sales").salary(20000).build());
    }
}
