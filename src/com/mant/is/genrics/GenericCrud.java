package com.mant.is.genrics;

import java.util.Optional;

public interface GenericCrud<T> {

	Iterable<T> getAll();
	T saveOrUpdate(T entity);
	Optional<T> findById(Integer id);
	boolean deleteById(Integer id);
}
