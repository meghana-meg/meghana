package com.cg.onlinecorona1.service;

import java.util.List;

import com.cg.onlinecorona1.Exception.DepartmentIdException;
import com.cg.onlinecorona1.entities.Department;



public interface DepartmentService {
	public Iterable<Department> getAllDepartments();

	public Department findDepartmentById(Integer departmentId) ;

	public Department saveDepartment(Department department);

	public Department updateDepartment( Department department);
	
}
