package model.dao;

import db.DB;
import model.dao.implement.SellerDaoJDBC;

public class DaoFactory { // classe que vai ter operações  statics para instanciar os DAOS

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection()); // vai instanciar uma implementação
	}
}
