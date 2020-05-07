package com.example.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "noidunghoctap", schema = "school", catalog = "")
public class NoidunghoctapEntity {
    private long id;
    private String ten;
    private Integer nam;
    private Integer thang;
    private Integer tuan;
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
    @Column(name = "ten", nullable = true, length = 200)
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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
    @Column(name = "thang", nullable = true)
    public Integer getThang() {
        return thang;
    }

    public void setThang(Integer thang) {
        this.thang = thang;
    }

    @Basic
    @Column(name = "tuan", nullable = true)
    public Integer getTuan() {
        return tuan;
    }

    public void setTuan(Integer tuan) {
        this.tuan = tuan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoidunghoctapEntity that = (NoidunghoctapEntity) o;

        if (id != that.id) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;
        if (nam != null ? !nam.equals(that.nam) : that.nam != null) return false;
        if (thang != null ? !thang.equals(that.thang) : that.thang != null) return false;
        if (tuan != null ? !tuan.equals(that.tuan) : that.tuan != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        result = 31 * result + (nam != null ? nam.hashCode() : 0);
        result = 31 * result + (thang != null ? thang.hashCode() : 0);
        result = 31 * result + (tuan != null ? tuan.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "noidunghoctapByManoidunghoctap")
    public Collection<LopNoidunghoctapEntity> getLopNoidunghoctapsById() {
        return lopNoidunghoctapsById;
    }

    public void setLopNoidunghoctapsById(Collection<LopNoidunghoctapEntity> lopNoidunghoctapsById) {
        this.lopNoidunghoctapsById = lopNoidunghoctapsById;
    }
}
