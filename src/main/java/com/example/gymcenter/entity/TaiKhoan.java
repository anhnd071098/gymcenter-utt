package com.example.gymcenter.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name =  "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long ID;

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

    @Column(name = "active")
    private Boolean active;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<PhanQuyen> phanQuyens;


    public TaiKhoan() {
    }


    public TaiKhoan(String tenNguoiDung,String email, Boolean active, String matKhau, Collection<PhanQuyen> phanQuyens) {
        this.tenNguoiDung = tenNguoiDung;
        this.active = active;
        this.email = email;
        this.matKhau = matKhau;
        this.phanQuyens = phanQuyens;

    }


    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long id) {
        this.ID = id;
    }

    public Collection<PhanQuyen> getPhanQuyens() {
        return phanQuyens;
    }

    public void setPhanQuyens(Collection<PhanQuyen> phanQuyens) {
        this.phanQuyens = phanQuyens;
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
