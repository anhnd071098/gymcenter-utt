package com.example.gymcenter.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BaiViet")
public class BaiViet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "tenBaiViet")
    private String tenBaiViet;

    @Column(name = "hinhAnh")
    private String hinhAnh;

    @Column(name = "tomtat")
    private String tomtat;

    @Column(name = "noiDungBaiViet")
    private String noiDungBaiViet;

    @Column(name = "ngayTao")
    private Date ngayTao;

    @Column(name = "ngayCapNhat")
    private Date ngayCapNhat;

    @Column(name = "IDAdmin")
    private Integer IDAdmin;

    public BaiViet() {
    }

    public BaiViet(Integer ID, String tenBaiViet, String hinhAnh, String tomtat, String noiDungBaiViet, Date ngayTao, Date ngayCapNhat, Integer IDAdmin) {
        this.ID = ID;
        this.tenBaiViet = tenBaiViet;
        this.hinhAnh = hinhAnh;
        this.tomtat = tomtat;
        this.noiDungBaiViet = noiDungBaiViet;
        this.ngayTao = ngayTao;
        this.ngayCapNhat = ngayCapNhat;
        this.IDAdmin = IDAdmin;
    }

    public BaiViet(String tenBaiViet, String hinhAnh, String tomtat, String noiDungBaiViet, Date ngayTao, Date ngayCapNhat) {
        this.tenBaiViet = tenBaiViet;
        this.hinhAnh = hinhAnh;
        this.tomtat = tomtat;
        this.noiDungBaiViet = noiDungBaiViet;
        this.ngayTao = ngayTao;
        this.ngayCapNhat = ngayCapNhat;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTenBaiViet() {
        return tenBaiViet;
    }

    public void setTenBaiViet(String tenBaiViet) {
        this.tenBaiViet = tenBaiViet;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
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

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(Date ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    public Integer getIDAdmin() {
        return IDAdmin;
    }

    public void setIDAdmin(Integer IDAdmin) {
        this.IDAdmin = IDAdmin;
    }
}
