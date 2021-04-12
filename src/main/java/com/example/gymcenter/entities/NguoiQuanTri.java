package com.example.gymcenter.entities;

import javax.persistence.*;

@Entity
@Table(name = "NguoiQuanTri")
public class NguoiQuanTri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "tenNguoiQuanTri")
    private String tenNguoiQuanTri;

    @Column(name = "tuoi")
    private Integer tuoi;

    @Column(name = "diaChi")
    private String diaChi;

    @Column(name = "soDienThoai")
    private String soDienThoai;

    @Column(name = "tenTaiKhoan")
    private String tenTaiKhoan;

    @Column(name = "matKhau")
    private String matKhau;

    public NguoiQuanTri() {
    }

    public NguoiQuanTri(Integer ID, String tenNguoiQuanTri, Integer tuoi, String diaChi, String soDienThoai, String tenTaiKhoan, String matKhau) {
        this.ID = ID;
        this.tenNguoiQuanTri = tenNguoiQuanTri;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
    }

    public NguoiQuanTri(String tenNguoiQuanTri, Integer tuoi, String diaChi, String soDienThoai, String tenTaiKhoan, String matKhau) {
        this.tenNguoiQuanTri = tenNguoiQuanTri;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTenNguoiQuanTri() {
        return tenNguoiQuanTri;
    }

    public void setTenNguoiQuanTri(String tenNguoiQuanTri) {
        this.tenNguoiQuanTri = tenNguoiQuanTri;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
}
