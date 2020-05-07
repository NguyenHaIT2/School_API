package com.example.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "diemdanhve", schema = "school", catalog = "")
public class DiemdanhveEntity {
    private int id;
    private String ten;
    private Collection<HocsinhVeEntity> hocsinhVesById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ten", nullable = true, length = 20)
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

        DiemdanhveEntity that = (DiemdanhveEntity) o;

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

    @OneToMany(mappedBy = "diemdanhveByMave")
    public Collection<HocsinhVeEntity> getHocsinhVesById() {
        return hocsinhVesById;
    }

    public void setHocsinhVesById(Collection<HocsinhVeEntity> hocsinhVesById) {
        this.hocsinhVesById = hocsinhVesById;
    }
}
