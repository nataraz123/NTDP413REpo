package com.nt.factory;

import com.nt.dao.DAO;
import com.nt.dao.DBCourseDAOImpl;
import com.nt.dao.DBStudentDAOImpl;
import com.nt.dao.ExcelCourseDAOImpl;
import com.nt.dao.ExcelStudentDAOImpl;

public class ExcelDAOFactory implements DAOFactory {
	
	public DAO   createDAO(String daoType) {
		DAO dao=null;
		if(daoType.equalsIgnoreCase("student"))
			dao=new ExcelStudentDAOImpl();
		else if(daoType.equalsIgnoreCase("course"))
			dao=new ExcelCourseDAOImpl();
		else
			throw new IllegalArgumentException("invalid DAO type");
		
		return dao;
	}

}
