package com.example.gymcenter.request;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

public class LienHeRequest {
    private Integer ID;

    @NotNull
    private String tenNguoiCanTuVan;

    @NotNull
    private String soDienThoai;

    @NotNull
    private String noiDung;

    private String trangThai;

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
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

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
}
