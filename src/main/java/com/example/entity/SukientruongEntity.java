package com.example.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "sukientruong", schema = "school", catalog = "")
public class SukientruongEntity {
    private long id;
    private Date thoigianbatdau;
    private Date thoigianketthuc;
    private String ten;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "thoigianbatdau", nullable = true)
    public Date getThoigianbatdau() {
        return thoigianbatdau;
    }

    public void setThoigianbatdau(Date thoigianbatdau) {
        this.thoigianbatdau = thoigianbatdau;
    }

    @Basic
    @Column(name = "thoigianketthuc", nullable = true)
    public Date getThoigianketthuc() {
        return thoigianketthuc;
    }

    public void setThoigianketthuc(Date thoigianketthuc) {
        this.thoigianketthuc = thoigianketthuc;
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

        SukientruongEntity that = (SukientruongEntity) o;

        if (id != that.id) return false;
        if (thoigianbatdau != null ? !thoigianbatdau.equals(that.thoigianbatdau) : that.thoigianbatdau != null)
            return false;
        if (thoigianketthuc != null ? !thoigianketthuc.equals(that.thoigianketthuc) : that.thoigianketthuc != null)
            return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (thoigianbatdau != null ? thoigianbatdau.hashCode() : 0);
        result = 31 * result + (thoigianketthuc != null ? thoigianketthuc.hashCode() : 0);
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        return result;
    }
}
