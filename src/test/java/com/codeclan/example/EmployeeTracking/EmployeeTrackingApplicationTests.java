package com.codeclan.example.EmployeeTracking;

import com.codeclan.example.EmployeeTracking.models.Employee;
import com.codeclan.example.EmployeeTracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeTrackingApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}
	@Test
	public void createEmployee(){
		Employee gavin = new Employee ("Gavin", 40, 2039, "gav@hotmail.com");
		employeeRepository.save(gavin);
	}

}
