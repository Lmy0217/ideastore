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

import com.agekt.ideastore.entity.mapper.ActivationMapper;

@Component
@Entity
@Table(name=ActivationMapper.TABLE)
public class Activation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name=ActivationMapper.ID)
    private long id;
    
    @Column(name=ActivationMapper.CODE)
    private String code;
    
    @Column(name=ActivationMapper.DURATION)
    private long duration;
    
    @Column(name=ActivationMapper.USERID)
    private long userid;
    
    @Column(name=ActivationMapper.STATUS)
    private int status;
    
    @Column(name=ActivationMapper.CREATETIME)
    private Timestamp createtime;
    
    @Column(name=ActivationMapper.ACTIVETIME)
    private Timestamp activetime;

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getUserId() {
        return userid;
    }

    public void setUserId(long userid) {
        this.userid = userid;
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

    public Timestamp getActiveTime() {
        return activetime;
    }

    public void setActiveTime(Timestamp activetime) {
        this.activetime = activetime;
    }
    
    @Override
    public String toString() {
        return "Activation (id:" + id + ", code:" + code + ", duration:" + duration + 
                ", userid:" + userid + ", status:" + status + ", createtime:" + createtime + 
                ", activetime:" + activetime + ")";
    }
}
