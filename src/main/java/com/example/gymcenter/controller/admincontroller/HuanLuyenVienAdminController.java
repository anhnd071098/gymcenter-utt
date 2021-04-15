package com.example.gymcenter.controller.admincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/")
public class HuanLuyenVienAdminController {
    @GetMapping("/themHLV")
    public String add() {
        return "admin/them-huan-luyen-vien";
    }

    @GetMapping("/xemHLV")
    public String view() {
        return "admin/xem-huan-luyen-vien";
    }

    @GetMapping("/suaHLV")
    public String update() {
        return "admin/sua-huan-luyen-vien";
    }

    @GetMapping("/xoaHLV")
    public String delete() {
        return "";
    }
}

