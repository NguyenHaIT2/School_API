package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "lop_noidunghoctap", schema = "school", catalog = "")
@IdClass(LopNoidunghoctapEntityPK.class)
public class LopNoidunghoctapEntity {
    private long malop;
    private long manoidunghoctap;
    private LopEntity lopByMalop;
    private NoidunghoctapEntity noidunghoctapByManoidunghoctap;

    @Id
    @Column(name = "malop", nullable = false)
    public long getMalop() {
        return malop;
    }

    public void setMalop(long malop) {
        this.malop = malop;
    }

    @Id
    @Column(name = "manoidunghoctap", nullable = false)
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

        LopNoidunghoctapEntity that = (LopNoidunghoctapEntity) o;

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

    @ManyToOne
    @JoinColumn(name = "malop", referencedColumnName = "id", nullable = false)
    public LopEntity getLopByMalop() {
        return lopByMalop;
    }

    public void setLopByMalop(LopEntity lopByMalop) {
        this.lopByMalop = lopByMalop;
    }

    @ManyToOne
    @JoinColumn(name = "manoidunghoctap", referencedColumnName = "id", nullable = false)
    public NoidunghoctapEntity getNoidunghoctapByManoidunghoctap() {
        return noidunghoctapByManoidunghoctap;
    }

    public void setNoidunghoctapByManoidunghoctap(NoidunghoctapEntity noidunghoctapByManoidunghoctap) {
        this.noidunghoctapByManoidunghoctap = noidunghoctapByManoidunghoctap;
    }
}
