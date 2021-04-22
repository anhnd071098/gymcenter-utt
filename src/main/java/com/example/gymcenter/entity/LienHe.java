package com.example.gymcenter.entity;

import javax.persistence.*;

@Entity
@Table(name = "LienHe")
public class LienHe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "tenNguoiCanTuVan")
    private String tenNguoiCanTuVan;

    @Column(name = "soDienThoai")
    private String soDienThoai;

    @Column(name = "noiDungTuVan",columnDefinition="text")
    private String noiDungTuVan;

    public LienHe() {
    }

    public LienHe(Integer ID, String tenNguoiCanTuVan, String soDienThoai, String noiDungTuVan) {
        this.ID = ID;
        this.tenNguoiCanTuVan = tenNguoiCanTuVan;
        this.soDienThoai = soDienThoai;
        this.noiDungTuVan = noiDungTuVan;
    }

    public LienHe(String tenNguoiCanTuVan, String soDienThoai, String noiDungTuVan) {
        this.tenNguoiCanTuVan = tenNguoiCanTuVan;
        this.soDienThoai = soDienThoai;
        this.noiDungTuVan = noiDungTuVan;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTenNguoiCanTuVan() {
        return tenNguoiCanTuVan;
    }

    public void setTenNguoiCanTuVan(String tenNguoiCanTuVan) {
        this.tenNguoiCanTuVan = tenNguoiCanTuVan;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNoiDungTuVan() {
        return noiDungTuVan;
    }

    public void setNoiDungTuVan(String noiDungTuVan) {
        this.noiDungTuVan = noiDungTuVan;
    }
}
