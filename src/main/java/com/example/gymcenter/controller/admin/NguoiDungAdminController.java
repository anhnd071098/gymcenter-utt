package com.example.gymcenter.controller.admin;

import com.example.gymcenter.entity.TaiKhoan;
import com.example.gymcenter.services.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/admin")
public class NguoiDungAdminController {

    @Autowired
    private TaiKhoanService taiKhoanService;

    @GetMapping("/themND")
    public String add(Model model) {
        model.addAttribute("taikhoan",new TaiKhoan());
        return "admin/them-nguoi-dung";
    }

    @GetMapping("/xemND")
    public String view() {
        return "admin/xem-nguoi-dung";
    }

    @GetMapping("/suaND")
    public String update() {
        return "admin/sua-nguoi-dung";
    }

    @GetMapping("/xoaND")
    public String delete() {
        return "";
    }

    @PostMapping("/nguoidung/save")
    public String saveUser(@Valid @ModelAttribute("taikhoan") TaiKhoan taiKhoan) {
        return taiKhoanService.save(taiKhoan);
    }
}
