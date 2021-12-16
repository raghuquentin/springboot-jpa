package com.spring.jpa.dao.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.spring.jpa.dao.DepartmentDao;
import com.spring.jpa.model.Department;

@Repository
public class DepartmentRepository implements DepartmentDao {

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	@Override
	public void insert(Department department) {
		System.out.println(department.toString());
		try {
		Query q =  em.createNativeQuery("insert into DEPARTMENT values (?,?)");
		q.setParameter(1, department.getDepartmentId());
		q.setParameter(2, department.getDepartmentname());
		int n = q.executeUpdate();
		System.out.println(n);
		}catch (Exception e) {
			e.printStackTrace();
		}
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
		Query q =  em.createNativeQuery("select * from DEPARTMENT",Department.class);
		return q.getResultList();
	}

}
