package com.example.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "lop", schema = "school", catalog = "")
public class LopEntity {
    private long id;
    private String ten;
    private Long magiaovien;
    private Collection<HocsinhEntity> hocsinhsById;
    private GiaovienEntity giaovienByMagiaovien;
    private Collection<LopHoatdongEntity> lopHoatdongsById;
    private Collection<LopNoidunghoctapEntity> lopNoidunghoctapsById;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ten", nullable = true, length = 100)
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Basic
    @Column(name = "magiaovien", nullable = true)
    public Long getMagiaovien() {
        return magiaovien;
    }

    public void setMagiaovien(Long magiaovien) {
        this.magiaovien = magiaovien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LopEntity lopEntity = (LopEntity) o;

        if (id != lopEntity.id) return false;
        if (ten != null ? !ten.equals(lopEntity.ten) : lopEntity.ten != null) return false;
        if (magiaovien != null ? !magiaovien.equals(lopEntity.magiaovien) : lopEntity.magiaovien != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        result = 31 * result + (magiaovien != null ? magiaovien.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "lopByMalop")
    public Collection<HocsinhEntity> getHocsinhsById() {
        return hocsinhsById;
    }

    public void setHocsinhsById(Collection<HocsinhEntity> hocsinhsById) {
        this.hocsinhsById = hocsinhsById;
    }

    @ManyToOne
    @JoinColumn(name = "magiaovien", referencedColumnName = "id")
    public GiaovienEntity getGiaovienByMagiaovien() {
        return giaovienByMagiaovien;
    }

    public void setGiaovienByMagiaovien(GiaovienEntity giaovienByMagiaovien) {
        this.giaovienByMagiaovien = giaovienByMagiaovien;
    }

    @OneToMany(mappedBy = "lopByMalop")
    public Collection<LopHoatdongEntity> getLopHoatdongsById() {
        return lopHoatdongsById;
    }

    public void setLopHoatdongsById(Collection<LopHoatdongEntity> lopHoatdongsById) {
        this.lopHoatdongsById = lopHoatdongsById;
    }

    @OneToMany(mappedBy = "lopByMalop")
    public Collection<LopNoidunghoctapEntity> getLopNoidunghoctapsById() {
        return lopNoidunghoctapsById;
    }

    public void setLopNoidunghoctapsById(Collection<LopNoidunghoctapEntity> lopNoidunghoctapsById) {
        this.lopNoidunghoctapsById = lopNoidunghoctapsById;
    }
}
