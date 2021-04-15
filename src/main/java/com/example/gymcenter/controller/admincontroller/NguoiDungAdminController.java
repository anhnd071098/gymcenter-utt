package com.example.gymcenter.controller.admincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/")
public class NguoiDungAdminController {
    @GetMapping("/themND")
    public String add() {
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
}
