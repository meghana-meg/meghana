package com.cg.onlinecorona1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlinecorona1.Exception.DepartmentIdException;
import com.cg.onlinecorona1.entities.Department;
import com.cg.onlinecorona1.service.DepartmentService;

@RestController
@RequestMapping("/api/v2")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/getAllDepartments")
	public Iterable<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}

	@GetMapping("/finddepartment/{id}")
	public ResponseEntity<?> getDepartmentById(@PathVariable(value = "id") Integer departmentId){
		Department department= departmentService.findDepartmentById(departmentId);
		return  ResponseEntity.ok(department);
	}
	@PostMapping("/savedepartment")
	public Department createDepartment( @RequestBody Department department ) {
		return departmentService.saveDepartment(department);
	}

	@PutMapping("/updatedepartment")
	public ResponseEntity<?> updateDepartmentById( @RequestBody Department department) {
		Department department1= departmentService.updateDepartment( department);
		return  ResponseEntity.ok(department1);
	}

	 
}
