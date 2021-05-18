package com.codeclan.example.EmployeeTracking;

import com.codeclan.example.EmployeeTracking.models.Department;
import com.codeclan.example.EmployeeTracking.models.Employee;
import com.codeclan.example.EmployeeTracking.models.Project;
import com.codeclan.example.EmployeeTracking.repositories.DepartmentRepository;
import com.codeclan.example.EmployeeTracking.repositories.EmployeeRepository;
import com.codeclan.example.EmployeeTracking.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}
	@Test
	public void createEmployee(){
		Department department1 = new Department("HR");
		departmentRepository.save(department1);
		Employee gavin = new Employee ("Gavin", 40, 2039, "gav@hotmail.com", department1);
		employeeRepository.save(gavin);
		Project project1 = new Project("Cool Project 2.0", 120);
		project1.addEmployee(gavin);
		projectRepository.save(project1);


//		department1.addEmployee(gavin);
//		employeeRepository.save(gavin);

	}

}
