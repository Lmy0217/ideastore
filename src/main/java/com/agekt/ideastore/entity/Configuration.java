package com.agekt.ideastore.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.agekt.ideastore.entity.mapper.ConfigurationMapper;

@Component
@Entity
@Table(name=ConfigurationMapper.TABLE)
public class Configuration implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name=ConfigurationMapper.KEY)
    private String key;
    
    @Column(name=ConfigurationMapper.VALUE)
    private String value;

    
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "Configuration (key:" + key + ", value:" + value + ")";
    }
}
