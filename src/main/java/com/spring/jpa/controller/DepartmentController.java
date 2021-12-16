package com.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.model.Department;
import com.spring.jpa.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	@GetMapping("/health")
	public String healthCheck() {
		return "department controller running..";
	}
	@PostMapping(value = "/insert",consumes = "application/json")
	public void insertDepartment(@RequestBody Department department) {
		service.insert(department);
	}
	@GetMapping("/getAll")
	public List<Department> getAllDepartment(){
		return service.getAll();
	}
	
}
