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

import com.agekt.ideastore.entity.mapper.ChapterMapper;

@Component
@Entity
@Table(name=ChapterMapper.TABLE)
public class Chapter implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name=ChapterMapper.ID)
    private long id;
    
    @Column(name=ChapterMapper.TITLE)
    private String title;
    
    @Column(name=ChapterMapper.NOVELID)
    private long novelid;
    
    @Column(name=ChapterMapper.CONTENT)
    private String content;
    
    @Column(name=ChapterMapper.STATUS)
    private int status;
    
    @Column(name=ChapterMapper.CREATETIME)
    private Timestamp createtime;
    
    @Column(name=ChapterMapper.UPDATETIME)
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

    public long getNovelId() {
        return novelid;
    }

    public void setNovelId(long novelid) {
        this.novelid = novelid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public Timestamp getUpdateTime() {
        return updatetime;
    }

    public void setUpdateTime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }
    
    @Override
    public String toString() {
        return "Chapter (id:" + id + ", title:" + title + ", novelid:" + novelid + ", content:" + content + 
                ", status:" + status + ", createtime:" + createtime + ", updatetime:" + updatetime + ")";
    }
}
