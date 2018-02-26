package com.agekt.ideastore.service.Impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agekt.ideastore.dao.BaseDAO;
import com.agekt.ideastore.service.BaseService;

@Service
public class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {
    
    @Autowired
    private BaseDAO<T, ID> baseDAO;
    
    @Autowired
    private T t;

    @Override
    public boolean save(T entity) {
        return baseDAO.save(entity);
    }

    @Override
    public boolean delete(T entity) {
        return baseDAO.delete(entity);
    }

    @Override
    public boolean update(T e) {
        return baseDAO.update(e);
    }

    @Override
    public T findById(ID id) {
        return baseDAO.findById(t, id);
    }

}
