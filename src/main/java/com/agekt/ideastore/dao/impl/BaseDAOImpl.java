package com.agekt.ideastore.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.agekt.ideastore.dao.BaseDAO;

@Repository
public class BaseDAOImpl<T, ID extends Serializable> implements BaseDAO<T, ID> {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public boolean save(T entity) {
        boolean flag = false;
        try {
            entityManager.persist(entity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    @Override
    public T findById(T t, ID id) {
        return (T) entityManager.find(t.getClass(), id);
    }

    @SuppressWarnings("unchecked")
    @Transactional
    @Override
    public List<T> findBySql(String tablename, String filed, Object o) {
        String sql = "from " + tablename + " u WHERE u." + filed + "=?";
        System.out.println(sql + "--------sql语句-------------");
        Query query = entityManager.createQuery(sql);
        query.setParameter(1, o);
        List<T> list = query.getResultList();
        entityManager.close();
        return list;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T findObjectBySql(String tablename, String filed, Object o) {
        String sql = "from " + tablename + " u WHERE u." + filed + "=?";
        System.out.println(sql + "--------sql语句-------------");
        Query query = entityManager.createQuery(sql);
        query.setParameter(1, o);
        entityManager.close();
        return (T) query.getSingleResult();
    }

    @SuppressWarnings("unchecked")
    @Transactional
    @Override
    public List<T> findByMoreFiled(String tablename, LinkedHashMap<String, Object> map) {
        String sql = "from " + tablename + " u WHERE ";
        List<String> list = new ArrayList<>(map.keySet());
        List<Object> filedlist = new ArrayList<>();
        for (String filed : list) {
            sql += "u." + filed + "=? and ";
            filedlist.add(filed);
        }
        sql = sql.substring(0, sql.length() - 4);
        System.out.println(sql + "--------sql语句-------------");
        Query query = entityManager.createQuery(sql);
        for (int i = 0; i < filedlist.size(); i++) {
            query.setParameter(i + 1, map.get(filedlist.get(i)));
        }
        List<T> listRe = query.getResultList();
        entityManager.close();
        return listRe;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    @Override
    public List<T> findByMoreFiledPages(String tablename, LinkedHashMap<String, Object> map, int start,
            int pageNumber) {
        String sql = "from " + tablename + " u WHERE ";
        List<String> list = new ArrayList<>(map.keySet());
        List<Object> filedlist = new ArrayList<>();
        for (String filed : list) {
            sql += "u." + filed + "=? and ";
            filedlist.add(filed);
        }
        sql = sql.substring(0, sql.length() - 4);
        System.out.println(sql + "--------sql语句-------------");
        Query query = entityManager.createQuery(sql);
        for (int i = 0; i < filedlist.size(); i++) {
            query.setParameter(i + 1, map.get(filedlist.get(i)));
        }
        query.setFirstResult((start - 1) * pageNumber);
        query.setMaxResults(pageNumber);
        List<T> listRe = query.getResultList();
        entityManager.close();
        return listRe;
    }

    @SuppressWarnings("unchecked")
    @Transactional
    @Override
    public List<T> findByPages(String tablename, String filed, Object o, int start, int pageNumer) {
        String sql = "from " + tablename + " u WHERE u." + filed + "=?";
        System.out.println(sql + "--------page--sql语句-------------");
        List<T> list = new ArrayList<>();
        try {
            Query query = entityManager.createQuery(sql);
            query.setParameter(1, o);
            query.setFirstResult((start - 1) * pageNumer);
            query.setMaxResults(pageNumer);
            list = query.getResultList();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Transactional
    @Override
    public boolean update(T entity) {
        boolean flag = false;
        try {
            entityManager.merge(entity);
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Transactional
    @Override
    public Integer updateMoreFiled(String tablename, LinkedHashMap<String, Object> map) {
        String sql = "UPDATE " + tablename + " AS u SET ";
        List<String> list = new ArrayList<>(map.keySet());
        for (int i = 0; i < list.size() - 1; i++) {
            if (map.get(list.get(i)).getClass().getTypeName() == "java.lang.String") {
                System.out.println("-*****" + map.get(list.get(i)) + "------------" + list.get(i));
                sql += "u." + list.get(i) + "='" + map.get(list.get(i)) + "' , ";
            } else {
                sql += "u." + list.get(i) + "=" + map.get(list.get(i)) + " , ";
            }
        }
        sql = sql.substring(0, sql.length() - 2);
        sql += "where u.id=? ";
        System.out.println(sql + "--------sql语句-------------");
        int resurlt = 0;
        try {
            Query query = entityManager.createQuery(sql);
            query.setParameter(1, map.get("id"));
            resurlt = query.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return resurlt;
    }

    @Transactional
    @Override
    public boolean delete(T entity) {
        boolean flag = false;
        try {
            entityManager.remove(entityManager.merge(entity));
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public Long findCount(String tablename, LinkedHashMap<String, Object> map) {
        String sql = "select count(u) from " + tablename + " u WHERE ";
        List<String> list = new ArrayList<>(map.keySet());
        List<Object> filedlist = new ArrayList<>();
        for (String filed : list) {
            sql += "u." + filed + "=? and ";
            filedlist.add(filed);
        }
        sql = sql.substring(0, sql.length() - 4);
        System.out.println(sql + "--------sql语句-------------");
        Query query = entityManager.createQuery(sql);
        for (int i = 0; i < filedlist.size(); i++) {
            query.setParameter(i + 1, map.get(filedlist.get(i)));
        }
        return (Long) query.getSingleResult();
    }

}
