package com.example.gymcenter.entity;

import javax.persistence.*;

@Entity
@Table(name = "PhanQuyen")
public class PhanQuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "LoaiQuyen", nullable = false)
    private String loaiQuyen;

    public PhanQuyen() {
    }

    public PhanQuyen(Integer ID, String loaiQuyen) {
        this.ID = ID;
        this.loaiQuyen = loaiQuyen;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getLoaiQuyen() {
        return loaiQuyen;
    }

    public void setLoaiQuyen(String loaiQuyen) {
        this.loaiQuyen = loaiQuyen;
    }
}
