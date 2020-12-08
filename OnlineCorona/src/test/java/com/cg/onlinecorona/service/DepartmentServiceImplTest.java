package com.cg.onlinecorona.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.cg.onlinecorona1.entities.Department;
import com.cg.onlinecorona1.repository.DepartmentDaoImpl;
import com.cg.onlinecorona1.service.DepartmentServiceImpl;

class DepartmentServiceImplTest {
    @InjectMocks
	DepartmentServiceImpl dept;
    @Mock
    DepartmentDaoImpl dao;
    Department department = new Department();
    Optional<Department> optional;
    @BeforeEach
    public void before() {
    	department.setDepartmenthead("megha");
    	department.setDepartmentname("coronaconsulting");
    	optional=Optional.of(department);
    }
    @Test
      public void findByIdTest() {
    	when(dao.findByDepartmentid(101)).thenReturn(department); 
    	Department depart=dept.findDepartmentById(101);
    	System.out.println(depart);
    	assertEquals(department,depart);
      }
    @Test
     public void updateTest() {
    	when(dao.save(department)).thenReturn(department);
    	Department de=dept.updateDepartment(department);
    	assertEquals(department.getDepartmenthead(),de.getDepartmenthead());
     }
    @Test
    public void saveTest() {
    	when(dao.save(department)).thenReturn(department);
    	Department de=dept.saveDepartment(department);
    	assertEquals(department.getDepartmenthead(),de.getDepartmenthead());
    }

}
