package com.imedia.ecom.domain.dao;

import java.util.List;

public interface IDAO<T, ID> {

	T createEntity(final T entity);
	T updateEntity(final T entity);
	void deleteEntity(final T entity);

	T getEntityById(final ID id);
	void deleteEntityById(final ID id);

	List<T> getAll();

}
