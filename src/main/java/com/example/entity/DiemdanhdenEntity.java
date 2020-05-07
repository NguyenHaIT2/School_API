package com.example.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "diemdanhden", schema = "school", catalog = "")
public class DiemdanhdenEntity {
    private int id;
    private String ten;
    private Collection<HocsinhDenEntity> hocsinhDensById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ten", nullable = true, length = 50)
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

        DiemdanhdenEntity that = (DiemdanhdenEntity) o;

        if (id != that.id) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "diemdanhdenByMaden")
    public Collection<HocsinhDenEntity> getHocsinhDensById() {
        return hocsinhDensById;
    }

    public void setHocsinhDensById(Collection<HocsinhDenEntity> hocsinhDensById) {
        this.hocsinhDensById = hocsinhDensById;
    }
}
