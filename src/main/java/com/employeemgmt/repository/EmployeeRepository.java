package com.employeemgmt.repository;

import com.employeemgmt.entity.Employee;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM employee_table e WHERE " +
           "LOWER(e.name) LIKE LOWER(CONCAT('%', :searchText, '%')) OR " +
           "LOWER(e.department) LIKE LOWER(CONCAT('%', :searchText, '%'))")
    List<Employee> findEmployeeBySearchText(@Param("searchText") String searchText);
    
    
    @Query("SELECT e FROM employee_table e WHERE " +
    	       "(:department IS NULL OR e.department = :department) AND " +
    	       "(:minSalary IS NULL OR e.salary >= :minSalary) AND " +
    	       "(:maxSalary IS NULL OR e.salary <= :maxSalary)")
    	List<Employee> filterEmployees(@Param("department") String department,
    	                               @Param("minSalary") Double minSalary,
    	                               @Param("maxSalary") Double maxSalary);

}
