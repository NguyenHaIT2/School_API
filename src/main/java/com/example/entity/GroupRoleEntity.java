package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "group_role", schema = "school", catalog = "")
@IdClass(GroupRoleEntityPK.class)
public class GroupRoleEntity {
    private int groupid;
    private int roleid;
    private GroupEntity groupByGroupid;
    private RoleEntity roleByRoleid;

    @Id
    @Column(name = "groupid", nullable = false)
    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    @Id
    @Column(name = "roleid", nullable = false)
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

        GroupRoleEntity that = (GroupRoleEntity) o;

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

    @ManyToOne
    @JoinColumn(name = "groupid", referencedColumnName = "id", nullable = false)
    public GroupEntity getGroupByGroupid() {
        return groupByGroupid;
    }

    public void setGroupByGroupid(GroupEntity groupByGroupid) {
        this.groupByGroupid = groupByGroupid;
    }

    @ManyToOne
    @JoinColumn(name = "roleid", referencedColumnName = "id", nullable = false)
    public RoleEntity getRoleByRoleid() {
        return roleByRoleid;
    }

    public void setRoleByRoleid(RoleEntity roleByRoleid) {
        this.roleByRoleid = roleByRoleid;
    }
}
