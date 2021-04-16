package com.example.gymcenter.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "HopDong")
public class HopDong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "IDNguoiDung")
    private Integer IDNguoiDung;

    @Column(name = "tenNguoiDung")
    private String tenNguoiDung;

    @Column(name = "maThanhToan")
    private String maThanhToan;

    @Column(name = "IDHuanLuyenVien")
    private Integer IDHuanLuyenVien;

    @Column(name = "tenHuanLuyenVien")
    private String tenHuanLuyenVien;

    @Column(name = "ngayBatDau")
    private Date ngayBatDau;

    @Column(name = "ngayKetThuc")
    private Date ngayKetThuc;

    @Column(name = "soThangThue")
    private Integer soThangThue;

    public HopDong() {
    }

    public HopDong(Integer ID, Integer IDNguoiDung, String tenNguoiDung, String maThanhToan, Integer IDHuanLuyenVien, String tenHuanLuyenVien, Date ngayBatDau, Date ngayKetThuc, Integer soThangThue) {
        this.ID = ID;
        this.IDNguoiDung = IDNguoiDung;
        this.tenNguoiDung = tenNguoiDung;
        this.maThanhToan = maThanhToan;
        this.IDHuanLuyenVien = IDHuanLuyenVien;
        this.tenHuanLuyenVien = tenHuanLuyenVien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.soThangThue = soThangThue;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getIDNguoiDung() {
        return IDNguoiDung;
    }

    public void setIDNguoiDung(Integer IDNguoiDung) {
        this.IDNguoiDung = IDNguoiDung;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getMaThanhToan() {
        return maThanhToan;
    }

    public void setMaThanhToan(String maThanhToan) {
        this.maThanhToan = maThanhToan;
    }

    public Integer getIDHuanLuyenVien() {
        return IDHuanLuyenVien;
    }

    public void setIDHuanLuyenVien(Integer IDHuanLuyenVien) {
        this.IDHuanLuyenVien = IDHuanLuyenVien;
    }

    public String getTenHuanLuyenVien() {
        return tenHuanLuyenVien;
    }

    public void setTenHuanLuyenVien(String tenHuanLuyenVien) {
        this.tenHuanLuyenVien = tenHuanLuyenVien;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Integer getSoThangThue() {
        return soThangThue;
    }

    public void setSoThangThue(Integer soThangThue) {
        this.soThangThue = soThangThue;
    }
}
