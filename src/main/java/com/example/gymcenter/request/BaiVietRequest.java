package com.example.gymcenter.request;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

public class BaiVietRequest {
    private Integer ID;

    @NotNull
    private String tenBaiViet;

    @NotNull
    private String tomtat;

    @NotNull
    private String noiDungBaiViet;
    @NotNull
    private MultipartFile hinhAnh;


    public String getTenBaiViet() {
        return tenBaiViet;
    }

    public void setTenBaiViet(String tenBaiViet) {
        this.tenBaiViet = tenBaiViet;
    }

    public MultipartFile getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(MultipartFile hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTomtat() {
        return tomtat;
    }

    public void setTomtat(String tomtat) {
        this.tomtat = tomtat;
    }

    public String getNoiDungBaiViet() {
        return noiDungBaiViet;
    }

    public void setNoiDungBaiViet(String noiDungBaiViet) {
        this.noiDungBaiViet = noiDungBaiViet;
    }
}
