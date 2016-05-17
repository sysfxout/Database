package org.ysc.database.model.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.ysc.database.factory.DBSessionFactory;
import org.ysc.database.model.PlayerInfo;

public class PlayerInfoDAO {
	public void create(PlayerInfo playerInfo) {
		Session session = DBSessionFactory.getNewSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		session.save(playerInfo);
		try {
			tx.commit();
		} catch (org.hibernate.exception.ConstraintViolationException e) {

		}

		session.close();
	}
}
