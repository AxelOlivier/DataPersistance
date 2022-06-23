package org.o7planning.Boulanger;

import java.util.List;
import org.o7planning.Boulanger.user;
import org.o7planning.Boulanger.I_DataAccess;
import org.o7planning.Boulanger.Hibernate_Utils;
import org.hibernate.Session;

public class ServiceUser implements I_DataAccess<user>{

	    public boolean create(user o) {
	        Session session =   Hibernate_Utils.getSessionFactory().openSession();
	        session.beginTransaction();
	        session.save(o);
	        session.getTransaction().commit();
	        session.close();
	        return true;
	        
	    }

	    public boolean update(user o) {
	        Session session =   Hibernate_Utils.getSessionFactory().openSession();
	        session.beginTransaction();
	        session.update(o);
	        session.getTransaction().commit();
	        session.close();
	        return true;
	    }


	    public user findById(int id) {
	        user u = null;
	        Session session =   Hibernate_Utils.getSessionFactory().openSession();
	        session.beginTransaction();
	        u = (user) session.get(user.class, id);
	        session.getTransaction().commit();
	        session.close();
	        return u;
	    }

	    public List<user> findAll() {
	         List<user> users = null;
	        Session session =   Hibernate_Utils.getSessionFactory().openSession();
	        session.beginTransaction();
	        users = session.createQuery("from User").list();
	        session.getTransaction().commit();
	        session.close();
	        return users;
	    }

		public boolean delete(user o) {
			// TODO Auto-generated method stub
			return false;
		}
}
