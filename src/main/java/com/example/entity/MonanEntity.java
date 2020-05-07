package com.example.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "monan", schema = "school", catalog = "")
public class MonanEntity {
    private long id;
    private String ten;
    private Collection<ThucdonEntity> thucdonsById;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ten", nullable = true, length = 200)
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MonanEntity that = (MonanEntity) o;

        if (id != that.id) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "monanByMamonan")
    public Collection<ThucdonEntity> getThucdonsById() {
        return thucdonsById;
    }

    public void setThucdonsById(Collection<ThucdonEntity> thucdonsById) {
        this.thucdonsById = thucdonsById;
    }
}
