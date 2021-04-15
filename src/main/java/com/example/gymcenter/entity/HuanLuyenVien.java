package com.example.gymcenter.entity;

import javax.persistence.*;

@Entity
@Table(name = "HuanLuyenVien")
public class HuanLuyenVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "tenHuanLuyenVien")
    private String tenHuanLuyenVien;

    @Column(name = "tuoi")
    private Integer tuoi;

    @Column(name = "kinhNghiem")
    private String kinhNghiem;

    @Column(name = "thanhTich")
    private String thanhTich;

    @Column(name = "tinhTrangThue")
    private Integer tinhTrangThue;

    @Column(name = "IDAdmin")
    private Integer IDAdmin;

    public HuanLuyenVien() {
    }

    public HuanLuyenVien(Integer ID, String tenHuanLuyenVien, Integer tuoi, String kinhNghiem, String thanhTich, Integer tinhTrangThue, Integer IDAdmin) {
        this.ID = ID;
        this.tenHuanLuyenVien = tenHuanLuyenVien;
        this.tuoi = tuoi;
        this.kinhNghiem = kinhNghiem;
        this.thanhTich = thanhTich;
        this.tinhTrangThue = tinhTrangThue;
        this.IDAdmin = IDAdmin;
    }

    public HuanLuyenVien(String tenHuanLuyenVien, Integer tuoi, String kinhNghiem, String thanhTich, Integer tinhTrangThue) {
        this.tenHuanLuyenVien = tenHuanLuyenVien;
        this.tuoi = tuoi;
        this.kinhNghiem = kinhNghiem;
        this.thanhTich = thanhTich;
        this.tinhTrangThue = tinhTrangThue;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTenHuanLuyenVien() {
        return tenHuanLuyenVien;
    }

    public void setTenHuanLuyenVien(String tenHuanLuyenVien) {
        this.tenHuanLuyenVien = tenHuanLuyenVien;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getKinhNghiem() {
        return kinhNghiem;
    }

    public void setKinhNghiem(String kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }

    public String getThanhTich() {
        return thanhTich;
    }

    public void setThanhTich(String thanhTich) {
        this.thanhTich = thanhTich;
    }

    public Integer getTinhTrangThue() {
        return tinhTrangThue;
    }

    public void setTinhTrangThue(Integer tinhTrangThue) {
        this.tinhTrangThue = tinhTrangThue;
    }

    public Integer getIDAdmin() {
        return IDAdmin;
    }

    public void setIDAdmin(Integer IDAdmin) {
        this.IDAdmin = IDAdmin;
    }
}
