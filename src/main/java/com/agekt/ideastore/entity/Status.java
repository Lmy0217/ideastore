package com.agekt.ideastore.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.agekt.ideastore.entity.mapper.StatusMapper;

@Component
@Entity
@Table(name=StatusMapper.TABLE)
public class Status implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name=StatusMapper.ID)
    private long id;
    
    @Column(name=StatusMapper.NAME)
    private String name;
    
    @Column(name=StatusMapper.DESCRIPTION)
    private String description;
    
    @Column(name=StatusMapper.PARENTID)
    private long parentid;
    
    @Column(name=StatusMapper.CREATETIME)
    private Timestamp createtime;

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getParentId() {
        return parentid;
    }

    public void setParentId(long parentid) {
        this.parentid = parentid;
    }

    public Timestamp getCreateTime() {
        return createtime;
    }

    public void setCreateTime(Timestamp createtime) {
        this.createtime = createtime;
    }
    
    @Override
    public String toString() {
        return "Status (id:" + id + ", name:" + name + ", description:" + description + 
                ", parentid:" + parentid + ", createtime:" + createtime + ")";
    }
}
