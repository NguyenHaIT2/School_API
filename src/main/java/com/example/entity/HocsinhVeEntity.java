package com.example.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "hocsinh_ve", schema = "school", catalog = "")
public class HocsinhVeEntity {
    private long id;
    private Long mahocsinh;
    private Integer mave;
    private String nguoiduave;
    private Date ngay;
    private String gio;
    private String image;
    private HocsinhVeEntity hocsinhVeByMahocsinh;
    private Collection<HocsinhVeEntity> hocsinhVesById;
    private DiemdanhveEntity diemdanhveByMave;

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
    @Column(name = "mave", nullable = true)
    public Integer getMave() {
        return mave;
    }

    public void setMave(Integer mave) {
        this.mave = mave;
    }

    @Basic
    @Column(name = "nguoiduave", nullable = true, length = 50)
    public String getNguoiduave() {
        return nguoiduave;
    }

    public void setNguoiduave(String nguoiduave) {
        this.nguoiduave = nguoiduave;
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

        HocsinhVeEntity that = (HocsinhVeEntity) o;

        if (id != that.id) return false;
        if (mahocsinh != null ? !mahocsinh.equals(that.mahocsinh) : that.mahocsinh != null) return false;
        if (mave != null ? !mave.equals(that.mave) : that.mave != null) return false;
        if (nguoiduave != null ? !nguoiduave.equals(that.nguoiduave) : that.nguoiduave != null) return false;
        if (ngay != null ? !ngay.equals(that.ngay) : that.ngay != null) return false;
        if (gio != null ? !gio.equals(that.gio) : that.gio != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (mahocsinh != null ? mahocsinh.hashCode() : 0);
        result = 31 * result + (mave != null ? mave.hashCode() : 0);
        result = 31 * result + (nguoiduave != null ? nguoiduave.hashCode() : 0);
        result = 31 * result + (ngay != null ? ngay.hashCode() : 0);
        result = 31 * result + (gio != null ? gio.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "mahocsinh", referencedColumnName = "id")
    public HocsinhVeEntity getHocsinhVeByMahocsinh() {
        return hocsinhVeByMahocsinh;
    }

    public void setHocsinhVeByMahocsinh(HocsinhVeEntity hocsinhVeByMahocsinh) {
        this.hocsinhVeByMahocsinh = hocsinhVeByMahocsinh;
    }

    @OneToMany(mappedBy = "hocsinhVeByMahocsinh")
    public Collection<HocsinhVeEntity> getHocsinhVesById() {
        return hocsinhVesById;
    }

    public void setHocsinhVesById(Collection<HocsinhVeEntity> hocsinhVesById) {
        this.hocsinhVesById = hocsinhVesById;
    }

    @ManyToOne
    @JoinColumn(name = "mave", referencedColumnName = "id")
    public DiemdanhveEntity getDiemdanhveByMave() {
        return diemdanhveByMave;
    }

    public void setDiemdanhveByMave(DiemdanhveEntity diemdanhveByMave) {
        this.diemdanhveByMave = diemdanhveByMave;
    }
}
