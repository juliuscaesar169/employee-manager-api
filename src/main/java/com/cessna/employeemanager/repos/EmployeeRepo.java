package com.cessna.employeemanager.repos;

import com.cessna.employeemanager.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
