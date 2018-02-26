package com.agekt.ideastore.service;

import java.io.Serializable;

public interface BaseService<T, ID extends Serializable> {

    boolean save(T entity);
    
    boolean delete(T entity);
    
    boolean update(T e);
    
    T findById(ID id);
}
