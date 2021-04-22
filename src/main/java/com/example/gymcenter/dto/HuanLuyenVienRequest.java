package com.example.gymcenter.request;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

public class HuanLuyenVienRequest {
    private Integer ID;
    @NotNull
    private String tenHuanLuyenVien;

    @NotNull
    private Integer tuoi;

    @NotNull
    private String kinhNghiem;

    @NotNull
    private String thanhTich;

    @NotNull
    private MultipartFile hinhAnh;

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

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
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

    public MultipartFile getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(MultipartFile hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
