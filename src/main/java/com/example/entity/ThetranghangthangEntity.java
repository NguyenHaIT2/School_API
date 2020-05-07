package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "thetranghangthang", schema = "school", catalog = "")
public class ThetranghangthangEntity {
    private long id;
    private Integer chieucao;
    private Integer cannang;
    private Integer thang;
    private Integer nam;
    private Long mahocsinh;
    private Long magiaovien;
    private HocsinhEntity hocsinhByMahocsinh;
    private GiaovienEntity giaovienByMagiaovien;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "chieucao", nullable = true)
    public Integer getChieucao() {
        return chieucao;
    }

    public void setChieucao(Integer chieucao) {
        this.chieucao = chieucao;
    }

    @Basic
    @Column(name = "cannang", nullable = true)
    public Integer getCannang() {
        return cannang;
    }

    public void setCannang(Integer cannang) {
        this.cannang = cannang;
    }

    @Basic
    @Column(name = "thang", nullable = true)
    public Integer getThang() {
        return thang;
    }

    public void setThang(Integer thang) {
        this.thang = thang;
    }

    @Basic
    @Column(name = "nam", nullable = true)
    public Integer getNam() {
        return nam;
    }

    public void setNam(Integer nam) {
        this.nam = nam;
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

        ThetranghangthangEntity that = (ThetranghangthangEntity) o;

        if (id != that.id) return false;
        if (chieucao != null ? !chieucao.equals(that.chieucao) : that.chieucao != null) return false;
        if (cannang != null ? !cannang.equals(that.cannang) : that.cannang != null) return false;
        if (thang != null ? !thang.equals(that.thang) : that.thang != null) return false;
        if (nam != null ? !nam.equals(that.nam) : that.nam != null) return false;
        if (mahocsinh != null ? !mahocsinh.equals(that.mahocsinh) : that.mahocsinh != null) return false;
        if (magiaovien != null ? !magiaovien.equals(that.magiaovien) : that.magiaovien != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (chieucao != null ? chieucao.hashCode() : 0);
        result = 31 * result + (cannang != null ? cannang.hashCode() : 0);
        result = 31 * result + (thang != null ? thang.hashCode() : 0);
        result = 31 * result + (nam != null ? nam.hashCode() : 0);
        result = 31 * result + (mahocsinh != null ? mahocsinh.hashCode() : 0);
        result = 31 * result + (magiaovien != null ? magiaovien.hashCode() : 0);
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
    @JoinColumn(name = "magiaovien", referencedColumnName = "id")
    public GiaovienEntity getGiaovienByMagiaovien() {
        return giaovienByMagiaovien;
    }

    public void setGiaovienByMagiaovien(GiaovienEntity giaovienByMagiaovien) {
        this.giaovienByMagiaovien = giaovienByMagiaovien;
    }
}
