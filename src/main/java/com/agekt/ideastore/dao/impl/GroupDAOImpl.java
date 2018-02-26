package com.agekt.ideastore.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.agekt.ideastore.dao.GroupDAO;
import com.agekt.ideastore.entity.Group;
import com.agekt.ideastore.entity.mapper.GroupMapper;

@Repository
public class GroupDAOImpl extends BaseDAOImpl<Group, Long> implements GroupDAO {

    @Override
    public List<Group> findByName(String name, int start, int pageNumber) {
        return findByPages(GroupMapper.TABLE, GroupMapper.NAME, name, start, pageNumber);
    }

    @Override
    public List<Group> findByParentId(long parentid, int start, int pageNumber) {
        return findByPages(GroupMapper.TABLE, GroupMapper.PARENTID, parentid, start, pageNumber);
    }

    @Override
    public List<Group> findByStatus(int status, int start, int pageNumber) {
        return findByPages(GroupMapper.TABLE, GroupMapper.STATUS, status, start, pageNumber);
    }

}
