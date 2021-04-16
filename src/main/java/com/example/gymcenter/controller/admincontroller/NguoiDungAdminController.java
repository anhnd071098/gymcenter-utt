package com.example.gymcenter.controller.admincontroller;

import com.example.gymcenter.entity.TaiKhoan;
import com.example.gymcenter.services.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/admin")
public class NguoiDungAdminController {

    @Autowired
    private TaiKhoanService taiKhoanService;

    @GetMapping("/themND")
    public String add(Model model) {
        model.addAttribute("taikhoan",new TaiKhoan());
        return "/admin/them-nguoi-dung";
    }

    @GetMapping("/xemND")
    public String view(Model model) {
        model.addAttribute("taiKhoan",taiKhoanService.getList());
        return "admin/xem-nguoi-dung";
    }

    @GetMapping("/suaND/{id}/edit")
    public String update(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("taiKhoan1",taiKhoanService.findOne(id));
        return "admin/sua-nguoi-dung";
    }

    @GetMapping("/xoaND/{id}/delete")
    public String delete(@PathVariable("id") Integer id) {
        taiKhoanService.delete(id);
        return "redirect:/admin/xemND";
    }

    @PostMapping("/nguoidung/save")
    public String saveUser(@Valid @ModelAttribute("taikhoan") TaiKhoan taiKhoan) {
        return taiKhoanService.save(taiKhoan);
    }
}
