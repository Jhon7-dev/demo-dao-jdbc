package model.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import entities.Department;
import model.dao.DepartmentDao;

public class DepartamentDaoJDBC implements DepartmentDao{
	
	private Connection conn;

	@Override
	public void insert(Department obj) {
		PreparedStatement st = null;
		try {
			
		}
		
	}

	@Override
	public void update(Department obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
