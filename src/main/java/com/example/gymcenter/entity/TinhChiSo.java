package com.example.gymcenter.entity;

public class TinhChiSo {
    private Integer canNang;
    private Integer chieuCao;
    private Integer tuoi;
    private Integer gioiTinh;
    private String cuongDoTapLuyen;

    public TinhChiSo() {
    }

    public TinhChiSo(Integer canNang, Integer chieuCao, Integer tuoi, Integer gioiTinh, String cuongDoTapLuyen) {
        this.canNang = canNang;
        this.chieuCao = chieuCao;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.cuongDoTapLuyen = cuongDoTapLuyen;
    }

    public Integer getCanNang() {
        return canNang;
    }

    public void setCanNang(Integer canNang) {
        this.canNang = canNang;
    }

    public Integer getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(Integer chieuCao) {
        this.chieuCao = chieuCao;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Integer getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Integer gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCuongDoTapLuyen() {
        return cuongDoTapLuyen;
    }

    public void setCuongDoTapLuyen(String cuongDoTapLuyen) {
        this.cuongDoTapLuyen = cuongDoTapLuyen;
    }
}
