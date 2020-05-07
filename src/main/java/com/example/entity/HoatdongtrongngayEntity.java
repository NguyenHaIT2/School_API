package com.example.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "hoatdongtrongngay", schema = "school", catalog = "")
public class HoatdongtrongngayEntity {
    private long id;
    private Date ngay;
    private String gio;
    private String ten;
    private Collection<HinhanhEntity> hinhanhsById;
    private Collection<LopHoatdongEntity> lopHoatdongsById;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ngay", nullable = true)
    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    @Basic
    @Column(name = "gio", nullable = true, length = 45)
    public String getGio() {
        return gio;
    }

    public void setGio(String gio) {
        this.gio = gio;
    }

    @Basic
    @Column(name = "ten", nullable = true, length = 300)
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

        HoatdongtrongngayEntity that = (HoatdongtrongngayEntity) o;

        if (id != that.id) return false;
        if (ngay != null ? !ngay.equals(that.ngay) : that.ngay != null) return false;
        if (gio != null ? !gio.equals(that.gio) : that.gio != null) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (ngay != null ? ngay.hashCode() : 0);
        result = 31 * result + (gio != null ? gio.hashCode() : 0);
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "hoatdongtrongngayByMahoatdong")
    public Collection<HinhanhEntity> getHinhanhsById() {
        return hinhanhsById;
    }

    public void setHinhanhsById(Collection<HinhanhEntity> hinhanhsById) {
        this.hinhanhsById = hinhanhsById;
    }

    @OneToMany(mappedBy = "hoatdongtrongngayByMahoatdong")
    public Collection<LopHoatdongEntity> getLopHoatdongsById() {
        return lopHoatdongsById;
    }

    public void setLopHoatdongsById(Collection<LopHoatdongEntity> lopHoatdongsById) {
        this.lopHoatdongsById = lopHoatdongsById;
    }
}
