package application;

import java.util.Date;

import entities.Department;
import entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department(1,"back-end");
		
		System.out.println(obj);
		
		Seller seller = new Seller(21,"joao","joao@cloud.com",new Date(),3000.0,obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao(); // injeção de dependência
		
		System.out.println(seller);
	}
}
