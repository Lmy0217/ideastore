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

import com.agekt.ideastore.entity.mapper.NovelMapper;

@Component
@Entity
@Table(name=NovelMapper.TABLE)
public class Novel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name=NovelMapper.ID)
    private long id;
    
    @Column(name=NovelMapper.TITLE)
    private String title;
    
    @Column(name=NovelMapper.USERID)
    private long userid;
    
    @Column(name=NovelMapper.CHAPTERS)
    private String chapters;
    
    @Column(name=NovelMapper.STATUS)
    private int status;
    
    @Column(name=NovelMapper.CREATETIME)
    private Timestamp createtime;
    
    @Column(name=NovelMapper.UPDATETIME)
    private Timestamp updatetime;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getUserId() {
        return userid;
    }

    public void setUserId(long userid) {
        this.userid = userid;
    }

    public String getChapters() {
        return chapters;
    }

    public void setChapters(String chapters) {
        this.chapters = chapters;
    }

    public Timestamp getCreateTime() {
        return createtime;
    }

    public void setCreateTime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getUpdateTime() {
        return updatetime;
    }

    public void setUpdateTime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }
    
    @Override
    public String toString() {
        return "Novel (id:" + id + ", title:" + title + ", userid:" + userid + ", chapters:" + chapters + 
                ", status:" + status + ", createtime:" + createtime + ", updatetime:" + updatetime + ")";
    }
}
