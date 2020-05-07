package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "hocsinh_hocphi", schema = "school", catalog = "")
public class HocsinhHocphiEntity {
    private long id;
    private Long mahocsinh;
    private Integer thang;
    private Integer nam;
    private Integer tinhtrang;
    private Long sotien;
    private HocsinhEntity hocsinhByMahocsinh;

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
    @Column(name = "tinhtrang", nullable = true)
    public Integer getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(Integer tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    @Basic
    @Column(name = "sotien", nullable = true)
    public Long getSotien() {
        return sotien;
    }

    public void setSotien(Long sotien) {
        this.sotien = sotien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HocsinhHocphiEntity that = (HocsinhHocphiEntity) o;

        if (id != that.id) return false;
        if (mahocsinh != null ? !mahocsinh.equals(that.mahocsinh) : that.mahocsinh != null) return false;
        if (thang != null ? !thang.equals(that.thang) : that.thang != null) return false;
        if (nam != null ? !nam.equals(that.nam) : that.nam != null) return false;
        if (tinhtrang != null ? !tinhtrang.equals(that.tinhtrang) : that.tinhtrang != null) return false;
        if (sotien != null ? !sotien.equals(that.sotien) : that.sotien != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (mahocsinh != null ? mahocsinh.hashCode() : 0);
        result = 31 * result + (thang != null ? thang.hashCode() : 0);
        result = 31 * result + (nam != null ? nam.hashCode() : 0);
        result = 31 * result + (tinhtrang != null ? tinhtrang.hashCode() : 0);
        result = 31 * result + (sotien != null ? sotien.hashCode() : 0);
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
}
