package org.ysc.database.model.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.ysc.database.factory.DBSessionFactory;
import org.ysc.database.model.Match;

public class MatchDAO {
	
	public void create(Match match){
		Session session = DBSessionFactory.getNewSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		session.save(match);
		tx.commit();		
		session.close();
	}
	
	public Match retrieve(){
		return null;
	}
	
	public void update(){
		
	}
	
	public void delete(){
		
	}
}
