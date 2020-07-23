package com.fullstack.DemoResfullAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.DemoResfullAPI.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
