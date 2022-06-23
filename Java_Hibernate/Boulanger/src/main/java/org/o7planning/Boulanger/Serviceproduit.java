package org.o7planning.Boulanger;

import java.util.List;



import org.hibernate.Session;

public class Serviceproduit implements I_DataAccess<Produit>{
	 public boolean create(Produit o) {
	        Session session = Hibernate_Utils.getSessionFactory().openSession();
	        session.beginTransaction();
	        session.save(o);
	        session.getTransaction().commit();
	        return true;
	    }

	    public boolean update(Produit o) {
	        Session session = Hibernate_Utils.getSessionFactory().openSession();
	        session.beginTransaction();
	        session.update(o);
	        session.getTransaction().commit();
	        return true;
	    }

		public boolean delete(Produit o) {
			// TODO Auto-generated method stub
			return false;
		}

		public Produit findById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		public List<Produit> findAll() {
			// TODO Auto-generated method stub
			return null;
		}
}
