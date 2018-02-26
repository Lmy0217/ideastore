package com.agekt.ideastore.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.agekt.ideastore.entity.mapper.RolePermissionMapper;

@Component
@Entity
@Table(name=RolePermissionMapper.TABLE)
public class RolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name=RolePermissionMapper.ROLEID)
    private long roleid;
    
    @Column(name=RolePermissionMapper.PERMISSIONID)
    private long permissionid;
    
    @Column(name=RolePermissionMapper.CREATETIME)
    private Timestamp createtime;
    
    @Column(name=RolePermissionMapper.STOPTIME)
    private Timestamp stoptime;

    public long getRoleId() {
        return roleid;
    }

    public void setRoleId(long roleid) {
        this.roleid = roleid;
    }

    public long getPermissionId() {
        return permissionid;
    }

    public void setPermissionId(long permissionid) {
        this.permissionid = permissionid;
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
        return "RolePermission (roleid:" + roleid + ", permissionid:" + permissionid + ", createtime:" + createtime + ", stoptime:" + stoptime + ")";
    }
}
