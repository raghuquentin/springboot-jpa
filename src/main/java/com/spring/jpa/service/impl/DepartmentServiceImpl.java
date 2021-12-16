package com.spring.jpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.dao.DepartmentDao;
import com.spring.jpa.model.Department;
import com.spring.jpa.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDao dao;
	@Override
	public void insert(Department department) {
		dao.insert(department);
	}

	@Override
	public void delete(String deptId) {
	}

	@Override
	public void update(Department department) {
	}

	@Override
	public Department get(String deptId) {
		return null;
	}

	@Override
	public List<Department> getAll() {
		return this.dao.getAll();
	}

}
