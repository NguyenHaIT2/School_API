package com.example.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "group", schema = "school", catalog = "")
public class GroupEntity {
    private int id;
    private String name;
    private Collection<AdminEntity> adminsById;
    private Collection<GiaovienEntity> giaoviensById;
    private Collection<GroupRoleEntity> groupRolesById;
    private Collection<PhuhuynhEntity> phuhuynhsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupEntity that = (GroupEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "groupByGroupid")
    public Collection<AdminEntity> getAdminsById() {
        return adminsById;
    }

    public void setAdminsById(Collection<AdminEntity> adminsById) {
        this.adminsById = adminsById;
    }

    @OneToMany(mappedBy = "groupByGroupid")
    public Collection<GiaovienEntity> getGiaoviensById() {
        return giaoviensById;
    }

    public void setGiaoviensById(Collection<GiaovienEntity> giaoviensById) {
        this.giaoviensById = giaoviensById;
    }

    @OneToMany(mappedBy = "groupByGroupid")
    public Collection<GroupRoleEntity> getGroupRolesById() {
        return groupRolesById;
    }

    public void setGroupRolesById(Collection<GroupRoleEntity> groupRolesById) {
        this.groupRolesById = groupRolesById;
    }

    @OneToMany(mappedBy = "groupByGroupid")
    public Collection<PhuhuynhEntity> getPhuhuynhsById() {
        return phuhuynhsById;
    }

    public void setPhuhuynhsById(Collection<PhuhuynhEntity> phuhuynhsById) {
        this.phuhuynhsById = phuhuynhsById;
    }
}
