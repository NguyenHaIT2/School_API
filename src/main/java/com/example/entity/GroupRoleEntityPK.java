package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class GroupRoleEntityPK implements Serializable {
    private int groupid;
    private int roleid;

    @Column(name = "groupid", nullable = false)
    @Id
    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    @Column(name = "roleid", nullable = false)
    @Id
    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupRoleEntityPK that = (GroupRoleEntityPK) o;

        if (groupid != that.groupid) return false;
        if (roleid != that.roleid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = groupid;
        result = 31 * result + roleid;
        return result;
    }
}
