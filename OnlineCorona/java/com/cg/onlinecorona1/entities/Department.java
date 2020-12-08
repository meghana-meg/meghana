package com.cg.onlinecorona1.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int departmentid;
	private String departmentname;
	private String departmenthead;
	
	//@OneToMany
	//private List<Details>doctor_list;
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getDepartmenthead() {
		return departmenthead;
	}
	public void setDepartmenthead(String departmenthead) {
		this.departmenthead = departmenthead;
	}
	/*
	 * public List<Details> getDoctor_list() { return doctor_list; } public void
	 * setDoctor_list(List<Details> doctor_list) { this.doctor_list = doctor_list; }
	 */
}