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

import com.agekt.ideastore.entity.mapper.UserMapper;

@Component
@Entity
@Table(name=UserMapper.TABLE)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name=UserMapper.ID)
    private long id;
    
    @Column(name=UserMapper.USERNAME)
    private String username;
    
    @Column(name=UserMapper.NICKNAME)
    private String nickname;
    
    @Column(name=UserMapper.EMAIL)
    private String email;
    
    @Column(name=UserMapper.PHONE)
    private String phone;
    
    @Column(name=UserMapper.PASSWORD)
    private String password;
    
    @Column(name=UserMapper.STATUS)
    private int status;
    
    @Column(name=UserMapper.CREATETIME)
    private Timestamp createtime;
    
    @Column(name=UserMapper.ACTIVETIME)
    private Timestamp activetime;
    
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getNickname() {
        return nickname;
    }
    
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
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
        return "User (id:" + id + ", username:" + username + ", nickname:" + nickname + 
                ", email:" + email + ", phone:" + phone + ", password:" + password + 
                ", status:" + status + ", createtime:" + createtime + ", activetime:" + 
                activetime + ")";
    }
}
