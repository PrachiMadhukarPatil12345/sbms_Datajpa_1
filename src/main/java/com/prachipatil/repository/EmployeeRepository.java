package com.prachipatil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prachipatil.entity.Book;
import com.prachipatil.entity.Employee;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
	
	List<Employee >findByName(String name);
	List<Employee >findByDept(String dep);
	//List<Employee >findByCity(String dep);
	//List<Employee >findByGender(String dep);
	//List<Employee >findBySalary(int sal);
	
	//List<Employee >findByNameOrDept(String name,String dep);
	
	//List<Employee >findByNameAndDept(String name, String Dept);
	
	// List<Employee >findBycityAndDept(String name, String Dept);
	
	// List<Employee >findBydepAndsal(String name, String Dept);
	
	// List<Employee >findBySalaryGreaterThan(int sal);
	
	//List<Employee >findByNameStartingWith(String ss);
	
	//List<Employee >findByNameEndingWith(String ss);
	
	// List<Employee >findByNameContains(String ss);
	
	// List<Employee >findBydept(String ss);
	
	// List<Employee >findBycity(String ss);
	
	// List<Employee >findByCityAndDeptAndGender(String ss,String dept,String gender);
	
	
	
}
