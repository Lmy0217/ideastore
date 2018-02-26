package com.agekt.ideastore.dao.impl;

import org.springframework.stereotype.Repository;

import com.agekt.ideastore.dao.StatusDAO;
import com.agekt.ideastore.entity.Status;

@Repository
public class StatusDAOImpl extends BaseDAOImpl<Status, Long> implements StatusDAO {

}
