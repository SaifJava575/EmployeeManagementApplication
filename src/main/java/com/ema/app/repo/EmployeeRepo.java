package com.ema.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ema.app.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
