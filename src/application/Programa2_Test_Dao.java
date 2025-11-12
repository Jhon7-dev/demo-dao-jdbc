package application;

import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Programa2_Test_Dao {

	public static void main(String[] args) {
		// TESTANDO O DAO
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

	}

}
