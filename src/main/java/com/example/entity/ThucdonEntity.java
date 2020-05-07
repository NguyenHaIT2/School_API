package com.example.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "thucdon", schema = "school", catalog = "")
public class ThucdonEntity {
    private long id;
    private Long mamonan;
    private Date ngay;
    private MonanEntity monanByMamonan;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mamonan", nullable = true)
    public Long getMamonan() {
        return mamonan;
    }

    public void setMamonan(Long mamonan) {
        this.mamonan = mamonan;
    }

    @Basic
    @Column(name = "ngay", nullable = true)
    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThucdonEntity that = (ThucdonEntity) o;

        if (id != that.id) return false;
        if (mamonan != null ? !mamonan.equals(that.mamonan) : that.mamonan != null) return false;
        if (ngay != null ? !ngay.equals(that.ngay) : that.ngay != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (mamonan != null ? mamonan.hashCode() : 0);
        result = 31 * result + (ngay != null ? ngay.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "mamonan", referencedColumnName = "id")
    public MonanEntity getMonanByMamonan() {
        return monanByMamonan;
    }

    public void setMonanByMamonan(MonanEntity monanByMamonan) {
        this.monanByMamonan = monanByMamonan;
    }
}
