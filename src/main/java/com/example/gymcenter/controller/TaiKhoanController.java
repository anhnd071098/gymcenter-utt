package com.example.gymcenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaiKhoanController {

    @GetMapping("/dangnhap")
    public String dangnhap() {
        return "admin/dang-nhap";
    }

    @GetMapping("/taoTK")
    public String taoTK() {
        return "admin/tao-tai-khoan";
    }
}
