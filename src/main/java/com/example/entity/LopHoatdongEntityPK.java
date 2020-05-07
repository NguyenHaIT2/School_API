package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class LopHoatdongEntityPK implements Serializable {
    private long malop;
    private long mahoatdong;

    @Column(name = "malop", nullable = false)
    @Id
    public long getMalop() {
        return malop;
    }

    public void setMalop(long malop) {
        this.malop = malop;
    }

    @Column(name = "mahoatdong", nullable = false)
    @Id
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

        LopHoatdongEntityPK that = (LopHoatdongEntityPK) o;

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
}
