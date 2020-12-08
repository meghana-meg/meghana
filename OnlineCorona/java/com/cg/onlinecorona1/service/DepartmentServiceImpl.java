package com.cg.onlinecorona1.service;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.onlinecorona1.Exception.DepartmentIdException;
import com.cg.onlinecorona1.entities.Department;
import com.cg.onlinecorona1.repository.DepartmentDaoImpl;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentDaoImpl department;

	public Iterable<Department> getAllDepartments() {
		return department.findAll();
	}

	public Department findDepartmentById(@PathVariable(value = "id") Integer departmentId)  {

        Department u=department.findById(departmentId).orElse(null);
		if (u == null) {
			throw new DepartmentIdException("Department not available");
		
		}
		return u;
	}

	

	public Department saveDepartment(Department u) {
		Department dept=department.findByDepartmentid(u.getDepartmentid());
		 if(dept!=null)
			 throw new DepartmentIdException("Department already available");
		return department.save(u);
	}

	public Department updateDepartment( Department u)  {
		Department dept=department.findByDepartmentid(u.getDepartmentid());
		 if(dept==null)
			 throw new DepartmentIdException("Department not available");
		 dept.setDepartmentname(u.getDepartmentname());
		 dept.setDepartmenthead(u.getDepartmenthead());
		 return department.save(dept);
	}

	
}
