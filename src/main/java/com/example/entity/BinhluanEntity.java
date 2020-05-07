package com.example.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "binhluan", schema = "school", catalog = "")
public class BinhluanEntity {
    private long id;
    private Long maphuhuynh;
    private Long mahinhanh;
    private Date ngay;
    private String gio;
    private String noidung;
    private PhuhuynhEntity phuhuynhByMaphuhuynh;
    private HinhanhEntity hinhanhByMahinhanh;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "maphuhuynh", nullable = true)
    public Long getMaphuhuynh() {
        return maphuhuynh;
    }

    public void setMaphuhuynh(Long maphuhuynh) {
        this.maphuhuynh = maphuhuynh;
    }

    @Basic
    @Column(name = "mahinhanh", nullable = true)
    public Long getMahinhanh() {
        return mahinhanh;
    }

    public void setMahinhanh(Long mahinhanh) {
        this.mahinhanh = mahinhanh;
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
    @Column(name = "noidung", nullable = true, length = 300)
    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BinhluanEntity that = (BinhluanEntity) o;

        if (id != that.id) return false;
        if (maphuhuynh != null ? !maphuhuynh.equals(that.maphuhuynh) : that.maphuhuynh != null) return false;
        if (mahinhanh != null ? !mahinhanh.equals(that.mahinhanh) : that.mahinhanh != null) return false;
        if (ngay != null ? !ngay.equals(that.ngay) : that.ngay != null) return false;
        if (gio != null ? !gio.equals(that.gio) : that.gio != null) return false;
        if (noidung != null ? !noidung.equals(that.noidung) : that.noidung != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (maphuhuynh != null ? maphuhuynh.hashCode() : 0);
        result = 31 * result + (mahinhanh != null ? mahinhanh.hashCode() : 0);
        result = 31 * result + (ngay != null ? ngay.hashCode() : 0);
        result = 31 * result + (gio != null ? gio.hashCode() : 0);
        result = 31 * result + (noidung != null ? noidung.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "maphuhuynh", referencedColumnName = "id")
    public PhuhuynhEntity getPhuhuynhByMaphuhuynh() {
        return phuhuynhByMaphuhuynh;
    }

    public void setPhuhuynhByMaphuhuynh(PhuhuynhEntity phuhuynhByMaphuhuynh) {
        this.phuhuynhByMaphuhuynh = phuhuynhByMaphuhuynh;
    }

    @ManyToOne
    @JoinColumn(name = "mahinhanh", referencedColumnName = "id")
    public HinhanhEntity getHinhanhByMahinhanh() {
        return hinhanhByMahinhanh;
    }

    public void setHinhanhByMahinhanh(HinhanhEntity hinhanhByMahinhanh) {
        this.hinhanhByMahinhanh = hinhanhByMahinhanh;
    }
}
