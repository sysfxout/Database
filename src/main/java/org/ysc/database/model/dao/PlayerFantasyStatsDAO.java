package org.ysc.database.model.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.ysc.database.factory.DBSessionFactory;
import org.ysc.database.model.PlayerFantasyStats;

public class PlayerFantasyStatsDAO {
	public void create(PlayerFantasyStats playerFantasyStats) {
		Session session = DBSessionFactory.getNewSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		session.save(playerFantasyStats);
		try {
			tx.commit();
		} catch (org.hibernate.exception.ConstraintViolationException e) {

		}

		session.close();
	}
}
