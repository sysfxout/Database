package org.ysc.database.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBSessionFactory {
	

	private static SessionFactory sessionFactory 
		= new Configuration().configure().buildSessionFactory();
	
	
	public static Session getNewSession(){
		return sessionFactory.openSession();
	}
}
