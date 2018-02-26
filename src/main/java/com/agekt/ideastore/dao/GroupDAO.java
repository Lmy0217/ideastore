package com.agekt.ideastore.dao;

import java.util.List;

import com.agekt.ideastore.entity.Group;

public interface GroupDAO extends BaseDAO<Group, Long> {

    List<Group> findByName(String name, int start, int pageNumber);
    
    List<Group> findByParentId(long parentid, int start, int pageNumber);
    
    List<Group> findByStatus(int status, int start, int pageNumber);
}
