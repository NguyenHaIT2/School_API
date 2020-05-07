package com.example.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "hocsinh_den", schema = "school", catalog = "")
public class HocsinhDenEntity {
    private long id;
    private Long mahocsinh;
    private Integer maden;
    private String nguoiduadi;
    private Date ngay;
    private String gio;
    private String image;
    private HocsinhEntity hocsinhByMahocsinh;
    private DiemdanhdenEntity diemdanhdenByMaden;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mahocsinh", nullable = true)
    public Long getMahocsinh() {
        return mahocsinh;
    }

    public void setMahocsinh(Long mahocsinh) {
        this.mahocsinh = mahocsinh;
    }

    @Basic
    @Column(name = "maden", nullable = true)
    public Integer getMaden() {
        return maden;
    }

    public void setMaden(Integer maden) {
        this.maden = maden;
    }

    @Basic
    @Column(name = "nguoiduadi", nullable = true, length = 100)
    public String getNguoiduadi() {
        return nguoiduadi;
    }

    public void setNguoiduadi(String nguoiduadi) {
        this.nguoiduadi = nguoiduadi;
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
    @Column(name = "image", nullable = true, length = 150)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HocsinhDenEntity that = (HocsinhDenEntity) o;

        if (id != that.id) return false;
        if (mahocsinh != null ? !mahocsinh.equals(that.mahocsinh) : that.mahocsinh != null) return false;
        if (maden != null ? !maden.equals(that.maden) : that.maden != null) return false;
        if (nguoiduadi != null ? !nguoiduadi.equals(that.nguoiduadi) : that.nguoiduadi != null) return false;
        if (ngay != null ? !ngay.equals(that.ngay) : that.ngay != null) return false;
        if (gio != null ? !gio.equals(that.gio) : that.gio != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (mahocsinh != null ? mahocsinh.hashCode() : 0);
        result = 31 * result + (maden != null ? maden.hashCode() : 0);
        result = 31 * result + (nguoiduadi != null ? nguoiduadi.hashCode() : 0);
        result = 31 * result + (ngay != null ? ngay.hashCode() : 0);
        result = 31 * result + (gio != null ? gio.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "mahocsinh", referencedColumnName = "id")
    public HocsinhEntity getHocsinhByMahocsinh() {
        return hocsinhByMahocsinh;
    }

    public void setHocsinhByMahocsinh(HocsinhEntity hocsinhByMahocsinh) {
        this.hocsinhByMahocsinh = hocsinhByMahocsinh;
    }

    @ManyToOne
    @JoinColumn(name = "maden", referencedColumnName = "id")
    public DiemdanhdenEntity getDiemdanhdenByMaden() {
        return diemdanhdenByMaden;
    }

    public void setDiemdanhdenByMaden(DiemdanhdenEntity diemdanhdenByMaden) {
        this.diemdanhdenByMaden = diemdanhdenByMaden;
    }
}
