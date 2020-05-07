package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "lop_hoatdong", schema = "school", catalog = "")
@IdClass(LopHoatdongEntityPK.class)
public class LopHoatdongEntity {
    private long malop;
    private long mahoatdong;
    private LopEntity lopByMalop;
    private HoatdongtrongngayEntity hoatdongtrongngayByMahoatdong;

    @Id
    @Column(name = "malop", nullable = false)
    public long getMalop() {
        return malop;
    }

    public void setMalop(long malop) {
        this.malop = malop;
    }

    @Id
    @Column(name = "mahoatdong", nullable = false)
    public long getMahoatdong() {
        return mahoatdong;
    }

    public void setMahoatdong(long mahoatdong) {
        this.mahoatdong = mahoatdong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LopHoatdongEntity that = (LopHoatdongEntity) o;

        if (malop != that.malop) return false;
        if (mahoatdong != that.mahoatdong) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (malop ^ (malop >>> 32));
        result = 31 * result + (int) (mahoatdong ^ (mahoatdong >>> 32));
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "malop", referencedColumnName = "id", nullable = false)
    public LopEntity getLopByMalop() {
        return lopByMalop;
    }

    public void setLopByMalop(LopEntity lopByMalop) {
        this.lopByMalop = lopByMalop;
    }

    @ManyToOne
    @JoinColumn(name = "mahoatdong", referencedColumnName = "id", nullable = false)
    public HoatdongtrongngayEntity getHoatdongtrongngayByMahoatdong() {
        return hoatdongtrongngayByMahoatdong;
    }

    public void setHoatdongtrongngayByMahoatdong(HoatdongtrongngayEntity hoatdongtrongngayByMahoatdong) {
        this.hoatdongtrongngayByMahoatdong = hoatdongtrongngayByMahoatdong;
    }
}
