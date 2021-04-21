package com.example.gymcenter.entity;

import javax.persistence.*;
import java.util.Calendar;
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

    @Column(name = "tomtat",columnDefinition="text")

    private String tomtat;

    @Column(name = "noiDungBaiViet",columnDefinition="text")
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

    public int getDayCustom(){
        ngayTao = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(ngayTao);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return day;
    }

    public String getMonthCustom(){
        ngayTao = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(ngayTao);
        int monthNumber= cal.get(Calendar.MONTH);
        String monthString="";
        switch (monthNumber)
        {
            case 0: monthString="January";
            break;
            case 1: monthString="February";
                break;
            case 2: monthString="March";
                break;
            case 3: monthString="April";
                break;
            case 4: monthString="May";
                break;
            case 5: monthString="June";
                break;
            case 6: monthString="July";
                break;
            case 7: monthString="August";
                break;
            case 8: monthString="September";
                break;
            case 9: monthString="October";
                break;
            case 10: monthString="November";
                break;
            case 11: monthString="December";
                break;
        }
        return monthString;
    }
}
