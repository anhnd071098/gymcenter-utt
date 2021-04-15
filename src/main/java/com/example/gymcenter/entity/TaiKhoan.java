package com.example.gymcenter.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TaiKhoan")
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer ID;

    @Column(name = "tenNguoiDung")
    private String tenNguoiDung;

    @Column(name = "tuoi")
    private Integer tuoi;

    @Column(name = "diaChi")
    private String diaChi;

    @Column(name = "soDienThoai")
    private String soDienThoai;

    @Column(name = "email")
    private String email;

    @Column(name = "tenTaiKhoan")
    private String tenTaiKhoan;

    @Column(name = "matKhau")
    private String matKhau;

    @Column(name = "ngayCapNhat")
    private Date ngayCapNhat;

    @Column(name = "trangThaiThanhToan")
    private Integer trangThaiThanhToan;

    @Column(name = "trangThaiThue")
    private Integer trangThaiThue;

    @Column(name = "IDAdmin")
    private Integer IDAdmin;

    public TaiKhoan() {
    }

    public TaiKhoan(Integer ID, String tenNguoiDung, Integer tuoi, String diaChi, String soDienThoai, String email, String tenTaiKhoan, String matKhau, Date ngayCapNhat, Integer trangThaiThanhToan, Integer trangThaiThue, Integer IDAdmin) {
        this.ID = ID;
        this.tenNguoiDung = tenNguoiDung;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.ngayCapNhat = ngayCapNhat;
        this.trangThaiThanhToan = trangThaiThanhToan;
        this.trangThaiThue = trangThaiThue;
        this.IDAdmin = IDAdmin;
    }

    public TaiKhoan(String tenNguoiDung, Integer tuoi, String diaChi, String soDienThoai, String email, String tenTaiKhoan, String matKhau) {
        this.tenNguoiDung = tenNguoiDung;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
    }

    public Integer getID() {
        return ID;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public Date getNgayCapNhat() {
        return ngayCapNhat;
    }

    public Integer getTrangThaiThanhToan() {
        return trangThaiThanhToan;
    }

    public Integer getTrangThaiThue() {
        return trangThaiThue;
    }

    public Integer getIDAdmin() {
        return IDAdmin;
    }
}
