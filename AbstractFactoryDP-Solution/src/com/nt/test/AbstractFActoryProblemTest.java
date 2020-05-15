package com.nt.test;

import com.nt.dao.DAO;
import com.nt.factory.DAOFactory;
import com.nt.factory.DAOFactoryCreator;
import com.nt.factory.DBDAOFactory;
import com.nt.factory.ExcelDAOFactory;

public class AbstractFActoryProblemTest {

	public static void main(String[] args) {
		DAO  dao1=null,dao2=null;
		DAOFactory  factory=null;
		
		factory=DAOFactoryCreator.buildDAOFactory("db");
		dao1=factory.createDAO("student");
		dao2=factory.createDAO("course");
		dao1.insert();
		dao2.insert();
		
		

	}

}
