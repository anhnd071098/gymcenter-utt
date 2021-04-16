package com.example.gymcenter.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
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
    @Email
    @Column(name = "email")
    private String email;

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

    public TaiKhoan(Integer ID, String tenNguoiDung, Integer tuoi, String diaChi, String soDienThoai, String email, String matKhau, Date ngayCapNhat, Integer trangThaiThanhToan, Integer trangThaiThue, Integer IDAdmin) {
        this.ID = ID;
        this.tenNguoiDung = tenNguoiDung;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.matKhau = matKhau;
        this.ngayCapNhat = ngayCapNhat;
        this.trangThaiThanhToan = trangThaiThanhToan;
        this.trangThaiThue = trangThaiThue;
        this.IDAdmin = IDAdmin;
    }

    public TaiKhoan(String tenNguoiDung, Integer tuoi, String diaChi, String soDienThoai, String email) {
        this.tenNguoiDung = tenNguoiDung;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public TaiKhoan(String email, String matKhau) {
        this.email = email;
        this.matKhau = matKhau;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public Date getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(Date ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }

    public Integer getTrangThaiThanhToan() {
        return trangThaiThanhToan;
    }

    public void setTrangThaiThanhToan(Integer trangThaiThanhToan) {
        this.trangThaiThanhToan = trangThaiThanhToan;
    }

    public Integer getTrangThaiThue() {
        return trangThaiThue;
    }

    public void setTrangThaiThue(Integer trangThaiThue) {
        this.trangThaiThue = trangThaiThue;
    }

    public Integer getIDAdmin() {
        return IDAdmin;
    }

    public void setIDAdmin(Integer IDAdmin) {
        this.IDAdmin = IDAdmin;
    }
}
