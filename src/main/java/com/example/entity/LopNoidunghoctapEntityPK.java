package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class LopNoidunghoctapEntityPK implements Serializable {
    private long malop;
    private long manoidunghoctap;

    @Column(name = "malop", nullable = false)
    @Id
    public long getMalop() {
        return malop;
    }

    public void setMalop(long malop) {
        this.malop = malop;
    }

    @Column(name = "manoidunghoctap", nullable = false)
    @Id
    public long getManoidunghoctap() {
        return manoidunghoctap;
    }

    public void setManoidunghoctap(long manoidunghoctap) {
        this.manoidunghoctap = manoidunghoctap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LopNoidunghoctapEntityPK that = (LopNoidunghoctapEntityPK) o;

        if (malop != that.malop) return false;
        if (manoidunghoctap != that.manoidunghoctap) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (malop ^ (malop >>> 32));
        result = 31 * result + (int) (manoidunghoctap ^ (manoidunghoctap >>> 32));
        return result;
    }
}
