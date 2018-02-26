package com.agekt.ideastore.dao.impl;

import org.springframework.stereotype.Repository;

import com.agekt.ideastore.dao.NovelDAO;
import com.agekt.ideastore.entity.Novel;

@Repository
public class NovelDAOImpl extends BaseDAOImpl<Novel, Long> implements NovelDAO {

}
