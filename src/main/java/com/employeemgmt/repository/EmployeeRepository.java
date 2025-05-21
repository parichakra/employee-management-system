package com.employeemgmt.repository;



//import com.employeemgmt.entity.Employee;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//}


//first comment 
//package com.app.employeemgmt.repository;
//
//import com.app.employeemgmt.entity.Employee;
//import com.app.employeemgmt.entity.EmployeeDTOs;
//
//import java.util.List;
//
//import org.springframework.data.jdbc.repository.query.Query;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository // Indicates that this interface is a Spring Data repository.
//public interface EmployeeRepository extends JpaRepository<Employee, Long> {
////	public Employee save(Employee employee);
//
////	@Query("SELECT a FROM Employee a WHERE " + "a.department LIKE :searchText OR " + "a.name LIKE :searchText")
////	List<Employee> findEmployeeBySearchText(@Param("searchText") String searchText);
//	
//	@Query(value = "SELECT * FROM Employee WHERE department LIKE %:searchText% OR name LIKE %:searchText%")
//	List<Employee> findEmployeeBySearchText(@Param("searchText") String searchText);
//
//
//}



//newest comment 
//
//package com.app.employeemgmt.repository;

import com.employeemgmt.entity.Employee;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//
//    @Query("SELECT e FROM employee_table e WHERE LOWER(e.name) LIKE LOWER(:searchText) OR LOWER(e.department) LIKE LOWER(:searchText)")
//    List<Employee> findEmployeeBySearchText(@Param("searchText") String searchText);
//}
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
