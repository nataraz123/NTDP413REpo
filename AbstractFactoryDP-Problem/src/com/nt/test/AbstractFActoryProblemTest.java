package com.nt.test;

import com.nt.dao.DAO;
import com.nt.factory.DBDAOFactory;
import com.nt.factory.ExcelDAOFactory;

public class AbstractFActoryProblemTest {

	public static void main(String[] args) {
		DAO  dao1=null,dao2=null;
		
		dao1=DBDAOFactory.createDAO("student");
		dao1.insert();
		System.out.println("................................");
		dao2=ExcelDAOFactory.createDAO("course");
		dao2.insert();

	}

}
