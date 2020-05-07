package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class HocsinhHinhanhEntityPK implements Serializable {
    private long mahocsinh;
    private long mahinhanh;

    @Column(name = "mahocsinh", nullable = false)
    @Id
    public long getMahocsinh() {
        return mahocsinh;
    }

    public void setMahocsinh(long mahocsinh) {
        this.mahocsinh = mahocsinh;
    }

    @Column(name = "mahinhanh", nullable = false)
    @Id
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

        HocsinhHinhanhEntityPK that = (HocsinhHinhanhEntityPK) o;

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
}
