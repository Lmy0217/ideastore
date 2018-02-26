package com.agekt.ideastore.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.agekt.ideastore.entity.mapper.GroupRoleMapper;

@Component
@Entity
@Table(name=GroupRoleMapper.TABLE)
public class GroupRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name=GroupRoleMapper.GROUPID)
    private long groupid;
    
    @Column(name=GroupRoleMapper.ROLEID)
    private long roleid;
    
    @Column(name=GroupRoleMapper.CREATETIME)
    private Timestamp createtime;
    
    @Column(name=GroupRoleMapper.STOPTIME)
    private Timestamp stoptime;

    
    public long getGroupId() {
        return groupid;
    }

    public void setGroupId(long groupid) {
        this.groupid = groupid;
    }

    public long getRoleId() {
        return roleid;
    }

    public void setRoleId(long roleid) {
        this.roleid = roleid;
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
        return "GroupRole (groupid:" + groupid + ", roleid:" + roleid + ", createtime:" + createtime + ", stoptime:" + stoptime + ")";
    }
}
