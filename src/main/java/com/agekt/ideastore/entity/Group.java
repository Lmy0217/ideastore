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

import com.agekt.ideastore.entity.mapper.GroupMapper;

@Component
@Entity
@Table(name=GroupMapper.TABLE)
public class Group implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name=GroupMapper.ID)
    private long id;
    
    @Column(name=GroupMapper.NAME)
    private String name;
    
    @Column(name=GroupMapper.DESCRIPTION)
    private String description;
    
    @Column(name=GroupMapper.PARENTID)
    private long parentid;
    
    @Column(name=GroupMapper.STATUS)
    private int status;
    
    @Column(name=GroupMapper.CREATETIME)
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createtime;
    }

    public void setCreateTime(Timestamp createtime) {
        this.createtime = createtime;
    }
    
    @Override
    public String toString() {
        return "Group (id:" + id + ", name:" + name + ", description:" + description + 
                ", parentid:" + parentid + ", status:" + status + ", createtime:" + 
                createtime + ")";
    }
}
