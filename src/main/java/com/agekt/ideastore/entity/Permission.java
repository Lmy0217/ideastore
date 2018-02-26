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

import com.agekt.ideastore.entity.mapper.PermissionMapper;

@Component
@Entity
@Table(name = PermissionMapper.TABLE)
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = PermissionMapper.ID)
    private long id;

    @Column(name = PermissionMapper.NAME)
    private String name;

    @Column(name = PermissionMapper.DESCRIPTION)
    private String description;

    @Column(name = PermissionMapper.TYPE)
    private String type;

    @Column(name = PermissionMapper.CODE)
    private String code;

    @Column(name = PermissionMapper.URL)
    private String url;

    @Column(name = PermissionMapper.PARENTID)
    private long parentid;

    @Column(name = PermissionMapper.STATUS)
    private int status;

    @Column(name = PermissionMapper.CREATETIME)
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        return "Permission (id:" + id + ", name:" + name + ", description:" + description + ", type:" + type + ", code:"
                + code + ", url:" + url + ", parentid:" + parentid + ", status:" + status + ", createtime:" + createtime
                + ")";
    }
}
