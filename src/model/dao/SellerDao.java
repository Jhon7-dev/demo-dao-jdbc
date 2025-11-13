package model.dao;

import java.util.List;

import entities.Department;
import entities.Seller;

public interface SellerDao {
	void insert(Seller obj); // vai ser responsável por inserir objetos no banco de dados

	void update(Seller obj);

	void deleteById(Integer id);

	Seller findById(Integer id); // pega o Id e consulta no bd o objeto com esse Id
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);

}
