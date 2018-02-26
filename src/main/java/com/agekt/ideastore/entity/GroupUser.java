package com.agekt.ideastore.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.agekt.ideastore.entity.mapper.GroupUserMapper;

@Component
@Entity
@Table(name=GroupUserMapper.TABLE)
public class GroupUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name=GroupUserMapper.GROUPID)
    private long groupid;
    
    @Column(name=GroupUserMapper.USERID)
    private long userid;
    
    @Column(name=GroupUserMapper.CREATETIME)
    private Timestamp createtime;
    
    @Column(name=GroupUserMapper.STOPTIME)
    private Timestamp stoptime;

    
    public long getGroupId() {
        return groupid;
    }

    public void setGroupId(long groupid) {
        this.groupid = groupid;
    }

    public long getUserId() {
        return userid;
    }

    public void setUserId(long userid) {
        this.userid = userid;
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
        return "GroupUser (groupid:" + groupid + ", userid:" + userid + ", createtime:" + createtime + ", stoptime:" + stoptime + ")";
    }
}
