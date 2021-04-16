package com.example.gymcenter.entity;

import javax.persistence.*;

@Entity
@Table(name = "PhanQuyenNguoiDung")
public class PhanQuyenNguoiDung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDNguoiDung", nullable = false)
    private Integer IDNguoiDung;

    @Column(name = "IDPhanQuyen", nullable = false)
    private Integer IDPhanQuyen;

    public PhanQuyenNguoiDung() {
    }

    public PhanQuyenNguoiDung(Integer IDNguoiDung, Integer IDPhanQuyen) {
        this.IDNguoiDung = IDNguoiDung;
        this.IDPhanQuyen = IDPhanQuyen;
    }

    public Integer getIDNguoiDung() {
        return IDNguoiDung;
    }

    public void setIDNguoiDung(Integer IDNguoiDung) {
        this.IDNguoiDung = IDNguoiDung;
    }

    public Integer getIDPhanQuyen() {
        return IDPhanQuyen;
    }

    public void setIDPhanQuyen(Integer IDPhanQuyen) {
        this.IDPhanQuyen = IDPhanQuyen;
    }
}