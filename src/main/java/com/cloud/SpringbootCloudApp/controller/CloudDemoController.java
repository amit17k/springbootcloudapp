package com.cloud.SpringbootCloudApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.SpringbootCloudApp.model.Employee;
//Controller
@RestController
public class CloudDemoController {
	
 @GetMapping("/employeeDetails")
 public ResponseEntity<Employee> getEmployeeDetails() {
	 Employee employee = new Employee();
	 employee.setDesignation("Manager");
	 employee.setEmpId(12);
	 employee.setName("John Smith");
	 
 return ResponseEntity.ok(employee);

}
}
