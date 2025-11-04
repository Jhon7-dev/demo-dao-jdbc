package application;

import java.util.Date;

import entities.Department;
import entities.Seller;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department(1,"back-end");
		System.out.println(obj);
		Seller seller = new Seller(21,"joao","joao@cloud.com",new Date(),3000.0,obj);
		System.out.println(seller);
	}

}
