package com.agekt.ideastore.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.agekt.ideastore.entity.mapper.UserRoleMapper;

@Component
@Entity
@Table(name=UserRoleMapper.TABLE)
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name=UserRoleMapper.USERID)
    private long userid;
    
    @Column(name=UserRoleMapper.ROLEID)
    private long roleid;
    
    @Column(name=UserRoleMapper.TYPE)
    private String type;
    
    @Column(name=UserRoleMapper.CREATETIME)
    private Timestamp createtime;
    
    @Column(name=UserRoleMapper.STOPTIME)
    private Timestamp stoptime;

    
    public long getUserId() {
        return userid;
    }

    public void setUserId(long userid) {
        this.userid = userid;
    }

    public long getRoleId() {
        return roleid;
    }

    public void setRoleId(long roleid) {
        this.roleid = roleid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getCreateTime() {
        return createtime;
    }

    public void setCreateTime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getStopTime() {
        return stoptime;
    }

    public void setStopTime(Timestamp stoptime) {
        this.stoptime = stoptime;
    }
    
    @Override
    public String toString() {
        return "UserRole (userid:" + userid + ", roleid:" + roleid + ", type:" + type + ", createtime:" + createtime + ", stoptime:" + stoptime + ")";
    }
}
