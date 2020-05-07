package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "hocsinh_hinhanh", schema = "school", catalog = "")
@IdClass(HocsinhHinhanhEntityPK.class)
public class HocsinhHinhanhEntity {
    private long mahocsinh;
    private long mahinhanh;
    private HocsinhEntity hocsinhByMahocsinh;
    private HinhanhEntity hinhanhByMahinhanh;

    @Id
    @Column(name = "mahocsinh", nullable = false)
    public long getMahocsinh() {
        return mahocsinh;
    }

    public void setMahocsinh(long mahocsinh) {
        this.mahocsinh = mahocsinh;
    }

    @Id
    @Column(name = "mahinhanh", nullable = false)
    public long getMahinhanh() {
        return mahinhanh;
    }

    public void setMahinhanh(long mahinhanh) {
        this.mahinhanh = mahinhanh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HocsinhHinhanhEntity that = (HocsinhHinhanhEntity) o;

        if (mahocsinh != that.mahocsinh) return false;
        if (mahinhanh != that.mahinhanh) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (mahocsinh ^ (mahocsinh >>> 32));
        result = 31 * result + (int) (mahinhanh ^ (mahinhanh >>> 32));
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "mahocsinh", referencedColumnName = "id", nullable = false)
    public HocsinhEntity getHocsinhByMahocsinh() {
        return hocsinhByMahocsinh;
    }

    public void setHocsinhByMahocsinh(HocsinhEntity hocsinhByMahocsinh) {
        this.hocsinhByMahocsinh = hocsinhByMahocsinh;
    }

    @ManyToOne
    @JoinColumn(name = "mahinhanh", referencedColumnName = "id", nullable = false)
    public HinhanhEntity getHinhanhByMahinhanh() {
        return hinhanhByMahinhanh;
    }

    public void setHinhanhByMahinhanh(HinhanhEntity hinhanhByMahinhanh) {
        this.hinhanhByMahinhanh = hinhanhByMahinhanh;
    }
}
