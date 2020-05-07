package com.example.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "hinhanh", schema = "school", catalog = "")
public class HinhanhEntity {
    private long id;
    private String image;
    private Date thoigian;
    private Long mahoatdong;
    private Collection<BinhluanEntity> binhluansById;
    private HoatdongtrongngayEntity hoatdongtrongngayByMahoatdong;
    private Collection<HocsinhHinhanhEntity> hocsinhHinhanhsById;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "image", nullable = true, length = 150)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "thoigian", nullable = true)
    public Date getThoigian() {
        return thoigian;
    }

    public void setThoigian(Date thoigian) {
        this.thoigian = thoigian;
    }

    @Basic
    @Column(name = "mahoatdong", nullable = true)
    public Long getMahoatdong() {
        return mahoatdong;
    }

    public void setMahoatdong(Long mahoatdong) {
        this.mahoatdong = mahoatdong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HinhanhEntity that = (HinhanhEntity) o;

        if (id != that.id) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (thoigian != null ? !thoigian.equals(that.thoigian) : that.thoigian != null) return false;
        if (mahoatdong != null ? !mahoatdong.equals(that.mahoatdong) : that.mahoatdong != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (thoigian != null ? thoigian.hashCode() : 0);
        result = 31 * result + (mahoatdong != null ? mahoatdong.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "hinhanhByMahinhanh")
    public Collection<BinhluanEntity> getBinhluansById() {
        return binhluansById;
    }

    public void setBinhluansById(Collection<BinhluanEntity> binhluansById) {
        this.binhluansById = binhluansById;
    }

    @ManyToOne
    @JoinColumn(name = "mahoatdong", referencedColumnName = "id")
    public HoatdongtrongngayEntity getHoatdongtrongngayByMahoatdong() {
        return hoatdongtrongngayByMahoatdong;
    }

    public void setHoatdongtrongngayByMahoatdong(HoatdongtrongngayEntity hoatdongtrongngayByMahoatdong) {
        this.hoatdongtrongngayByMahoatdong = hoatdongtrongngayByMahoatdong;
    }

    @OneToMany(mappedBy = "hinhanhByMahinhanh")
    public Collection<HocsinhHinhanhEntity> getHocsinhHinhanhsById() {
        return hocsinhHinhanhsById;
    }

    public void setHocsinhHinhanhsById(Collection<HocsinhHinhanhEntity> hocsinhHinhanhsById) {
        this.hocsinhHinhanhsById = hocsinhHinhanhsById;
    }
}
