package com.example.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "hocsinh", schema = "school", catalog = "")
public class HocsinhEntity {
    private long id;
    private String ten;
    private Date ngaysinh;
    private Long magiaovien;
    private Long maphuhuynh;
    private Long malop;
    private GiaovienEntity giaovienByMagiaovien;
    private PhuhuynhEntity phuhuynhByMaphuhuynh;
    private LopEntity lopByMalop;
    private Collection<HocsinhDenEntity> hocsinhDensById;
    private Collection<HocsinhHinhanhEntity> hocsinhHinhanhsById;
    private Collection<HocsinhHocphiEntity> hocsinhHocphisById;
    private Collection<ThetranghangthangEntity> thetranghangthangsById;

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
    @Column(name = "ngaysinh", nullable = true)
    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    @Basic
    @Column(name = "magiaovien", nullable = true)
    public Long getMagiaovien() {
        return magiaovien;
    }

    public void setMagiaovien(Long magiaovien) {
        this.magiaovien = magiaovien;
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
    @Column(name = "malop", nullable = true)
    public Long getMalop() {
        return malop;
    }

    public void setMalop(Long malop) {
        this.malop = malop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HocsinhEntity that = (HocsinhEntity) o;

        if (id != that.id) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;
        if (ngaysinh != null ? !ngaysinh.equals(that.ngaysinh) : that.ngaysinh != null) return false;
        if (magiaovien != null ? !magiaovien.equals(that.magiaovien) : that.magiaovien != null) return false;
        if (maphuhuynh != null ? !maphuhuynh.equals(that.maphuhuynh) : that.maphuhuynh != null) return false;
        if (malop != null ? !malop.equals(that.malop) : that.malop != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        result = 31 * result + (ngaysinh != null ? ngaysinh.hashCode() : 0);
        result = 31 * result + (magiaovien != null ? magiaovien.hashCode() : 0);
        result = 31 * result + (maphuhuynh != null ? maphuhuynh.hashCode() : 0);
        result = 31 * result + (malop != null ? malop.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "magiaovien", referencedColumnName = "id")
    public GiaovienEntity getGiaovienByMagiaovien() {
        return giaovienByMagiaovien;
    }

    public void setGiaovienByMagiaovien(GiaovienEntity giaovienByMagiaovien) {
        this.giaovienByMagiaovien = giaovienByMagiaovien;
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
    @JoinColumn(name = "malop", referencedColumnName = "id")
    public LopEntity getLopByMalop() {
        return lopByMalop;
    }

    public void setLopByMalop(LopEntity lopByMalop) {
        this.lopByMalop = lopByMalop;
    }

    @OneToMany(mappedBy = "hocsinhByMahocsinh")
    public Collection<HocsinhDenEntity> getHocsinhDensById() {
        return hocsinhDensById;
    }

    public void setHocsinhDensById(Collection<HocsinhDenEntity> hocsinhDensById) {
        this.hocsinhDensById = hocsinhDensById;
    }

    @OneToMany(mappedBy = "hocsinhByMahocsinh")
    public Collection<HocsinhHinhanhEntity> getHocsinhHinhanhsById() {
        return hocsinhHinhanhsById;
    }

    public void setHocsinhHinhanhsById(Collection<HocsinhHinhanhEntity> hocsinhHinhanhsById) {
        this.hocsinhHinhanhsById = hocsinhHinhanhsById;
    }

    @OneToMany(mappedBy = "hocsinhByMahocsinh")
    public Collection<HocsinhHocphiEntity> getHocsinhHocphisById() {
        return hocsinhHocphisById;
    }

    public void setHocsinhHocphisById(Collection<HocsinhHocphiEntity> hocsinhHocphisById) {
        this.hocsinhHocphisById = hocsinhHocphisById;
    }

    @OneToMany(mappedBy = "hocsinhByMahocsinh")
    public Collection<ThetranghangthangEntity> getThetranghangthangsById() {
        return thetranghangthangsById;
    }

    public void setThetranghangthangsById(Collection<ThetranghangthangEntity> thetranghangthangsById) {
        this.thetranghangthangsById = thetranghangthangsById;
    }
}
