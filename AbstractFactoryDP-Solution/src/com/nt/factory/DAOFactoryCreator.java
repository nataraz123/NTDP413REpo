package com.nt.factory;

// Abstract FActory or Super Factory
public class DAOFactoryCreator {

	public static  DAOFactory  buildDAOFactory(String factoryType) {
		DAOFactory factory=null;
		if(factoryType.equalsIgnoreCase("excel"))
			factory=new ExcelDAOFactory();
		else if(factoryType.equalsIgnoreCase("db"))
			factory=new DBDAOFactory();
		else
			throw new IllegalArgumentException("Invalid Factory type");
		return factory;
		
	}
}
