package com.nt.factory;

import com.nt.dao.DAO;
import com.nt.dao.DBCourseDAOImpl;
import com.nt.dao.DBStudentDAOImpl;

public class DBDAOFactory implements DAOFactory{
	
	public   DAO   createDAO(String daoType) {
		DAO dao=null;
		if(daoType.equalsIgnoreCase("student"))
			dao=new DBStudentDAOImpl();
		else if(daoType.equalsIgnoreCase("course"))
			dao=new DBCourseDAOImpl();
		else
			throw new IllegalArgumentException("invalid DAO type");
		
		return dao;
	}

}
