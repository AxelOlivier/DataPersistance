package org.o7planning.Boulanger;

import java.util.List;

public interface I_DataAccess<T> {
	 boolean create(T o);

	    boolean update(T o);

	    boolean delete(T o);

	    T findById(int id);

	    List<T> findAll();
}
