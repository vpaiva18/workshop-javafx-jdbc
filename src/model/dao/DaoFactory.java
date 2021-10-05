package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoImpl;
import model.dao.impl.SellerDaoImpl;

public class DaoFactory {
	public static SellerDao createSellerDao() {
		return new SellerDaoImpl(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoImpl(DB.getConnection());
	}
}
