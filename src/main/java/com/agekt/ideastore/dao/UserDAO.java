package com.agekt.ideastore.dao;

import java.util.List;

import com.agekt.ideastore.entity.User;

public interface UserDAO extends BaseDAO<User, Long> {

    User findByUsername(String username);
    
    User findByEmail(String email);
    
    User findByPhone(String phone);
    
    List<User> findByNickname(String nickname, int start, int pageNumber);
    
    List<User> findByStatus(int status, int start, int pageNumber);
}
