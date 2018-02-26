package com.agekt.ideastore.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.agekt.ideastore.dao.UserDAO;
import com.agekt.ideastore.entity.User;
import com.agekt.ideastore.entity.mapper.UserMapper;

@Repository
public class UserDAOImpl extends BaseDAOImpl<User, Long> implements UserDAO {

    @Override
    public User findByUsername(String username) {
        return findObjectBySql(UserMapper.TABLE, UserMapper.USERNAME, username);
    }

    @Override
    public User findByEmail(String email) {
        return findObjectBySql(UserMapper.TABLE, UserMapper.EMAIL, email);
    }

    @Override
    public User findByPhone(String phone) {
        return findObjectBySql(UserMapper.TABLE, UserMapper.PHONE, phone);
    }

    @Override
    public List<User> findByNickname(String nickname, int start, int pageNumber) {
        return findByPages(UserMapper.TABLE, UserMapper.NICKNAME, nickname, start, pageNumber);
    }

    @Override
    public List<User> findByStatus(int status, int start, int pageNumber) {
        return findByPages(UserMapper.TABLE, UserMapper.STATUS, status, start, pageNumber);
    }

}
