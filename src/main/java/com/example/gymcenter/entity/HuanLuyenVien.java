package com.example.gymcenter.entity;

import javax.persistence.*;

@Entity
@Table(name = "HuanLuyenVien")
public class HuanLuyenVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "IDAdmin")
    private Integer IDAdmin;

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

    @Column(name = "hinhAnh")
    private String hinhAnh;

    public HuanLuyenVien() {
    }

    public HuanLuyenVien(Integer ID, Integer IDAdmin, String tenHuanLuyenVien, Integer tuoi, String kinhNghiem, String thanhTich, Integer tinhTrangThue, String hinhAnh) {
        this.ID = ID;
        this.IDAdmin = IDAdmin;
        this.tenHuanLuyenVien = tenHuanLuyenVien;
        this.tuoi = tuoi;
        this.kinhNghiem = kinhNghiem;
        this.thanhTich = thanhTich;
        this.tinhTrangThue = tinhTrangThue;
        this.hinhAnh = hinhAnh;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getIDAdmin() {
        return IDAdmin;
    }

    public void setIDAdmin(Integer IDAdmin) {
        this.IDAdmin = IDAdmin;
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

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
