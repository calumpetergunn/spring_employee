package com.codeclan.example.EmployeeTracking.repositories;

import com.codeclan.example.EmployeeTracking.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
