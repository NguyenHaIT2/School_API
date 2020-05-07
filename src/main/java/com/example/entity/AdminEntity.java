package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "admin", schema = "school", catalog = "")
public class AdminEntity {
    private long id;
    private String email;
    private String matkhau;
    private Integer groupid;
    private GroupEntity groupByGroupid;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "matkhau", nullable = true, length = 45)
    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    @Basic
    @Column(name = "groupid", nullable = true)
    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminEntity that = (AdminEntity) o;

        if (id != that.id) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (matkhau != null ? !matkhau.equals(that.matkhau) : that.matkhau != null) return false;
        if (groupid != null ? !groupid.equals(that.groupid) : that.groupid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (matkhau != null ? matkhau.hashCode() : 0);
        result = 31 * result + (groupid != null ? groupid.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "groupid", referencedColumnName = "id")
    public GroupEntity getGroupByGroupid() {
        return groupByGroupid;
    }

    public void setGroupByGroupid(GroupEntity groupByGroupid) {
        this.groupByGroupid = groupByGroupid;
    }
}
