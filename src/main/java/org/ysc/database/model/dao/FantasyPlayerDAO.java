package org.ysc.database.model.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.ysc.database.factory.DBSessionFactory;
import org.ysc.database.model.FantasyPlayer;

public class FantasyPlayerDAO {
	public void create(FantasyPlayer fantasyPlayer) {
		Session session = DBSessionFactory.getNewSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		session.save(fantasyPlayer);
		try {
			tx.commit();
		} catch (org.hibernate.exception.ConstraintViolationException e) {

		}

		session.close();
	}
}
