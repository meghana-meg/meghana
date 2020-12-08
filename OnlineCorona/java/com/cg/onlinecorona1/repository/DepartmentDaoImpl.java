package com.cg.onlinecorona1.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlinecorona1.entities.Department;

@Repository
public interface DepartmentDaoImpl extends CrudRepository<Department, Integer> {
	Department findByDepartmentid(int departmentid);
}