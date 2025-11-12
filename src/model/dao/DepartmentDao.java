package model.dao;

import java.util.List;

import entities.Department;

public interface DepartmentDao {
	void insert(Department obj); // vai ser responsável por inserir objetos no banco de dados
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id); // pega o Id e consulta no bd o objeto com esse Id
	List<Department>findAll();
}
