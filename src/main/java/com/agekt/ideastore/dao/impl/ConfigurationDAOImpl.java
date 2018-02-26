package com.agekt.ideastore.dao.impl;

import org.springframework.stereotype.Repository;

import com.agekt.ideastore.dao.ConfigurationDAO;
import com.agekt.ideastore.entity.Configuration;

@Repository
public class ConfigurationDAOImpl extends BaseDAOImpl<Configuration, String> implements ConfigurationDAO {

}
