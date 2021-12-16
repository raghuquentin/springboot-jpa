package com.spring.jpa.dao;

import java.util.List;

import com.spring.jpa.model.Department;

public interface DepartmentDao {
	public void insert(Department department);
	public void delete(String deptId);
	public void update(Department department);
	public Department get(String deptId);
	public List<Department> getAll();
}
