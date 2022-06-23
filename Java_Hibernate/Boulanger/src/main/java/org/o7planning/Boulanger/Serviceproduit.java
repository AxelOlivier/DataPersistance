package org.o7planning.Boulanger;

import org.hibernate.Session;

public class Serviceproduit {
	 @Override
	    public boolean create(Produit o) {
	        Session session = Hibernate_Utils.getSessionFactory().openSession();
	        session.beginTransaction();
	        session.save(o);
	        session.getTransaction().commit();
	        return true;
	    }

	    @Override
	    public boolean update(Produit o) {
	        Session session = Hibernate_Utils.getSessionFactory().openSession();
	        session.beginTransaction();
	        session.update(o);
	        session.getTransaction().commit();
	        return true;
	    }
}