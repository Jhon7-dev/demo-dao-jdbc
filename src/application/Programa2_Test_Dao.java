package application;

import java.util.Date;
import java.util.List;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Programa2_Test_Dao {

	public static void main(String[] args) {
		// TESTANDO O DAO

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== Test 1: seller findById ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== Test 2: seller findByDepartment ==== ");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
			System.out.println("\n=== Test 3: seller findByAll ==== ");
			list = sellerDao.findAll();
			for (Seller obj : list) {
				System.out.println(obj);

			}
			System.out.println("\n=== Test 4: seller insert ====");
			Seller newSeller = new Seller(null,"Greg","greg123@gmail.com",new Date(),4000.0, department);
			sellerDao.insert(newSeller);
			System.out.println("Inserted! New id = " + newSeller.getId());
			
			System.out.println("\n=== Test 5: seller update ====");
			seller = sellerDao.findById(1);
			seller.setName("Bruna Fernanda");
			sellerDao.update(seller);
			System.out.println("Uptade completed");
		}
	}

