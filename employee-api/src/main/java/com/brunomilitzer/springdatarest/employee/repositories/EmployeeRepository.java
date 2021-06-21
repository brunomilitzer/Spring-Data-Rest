package com.brunomilitzer.springdatarest.employee.repositories;

import com.brunomilitzer.springdatarest.employee.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
