package com.example.gymcenter.controller.admincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin/")
public class BaiVietAdminController {
    @GetMapping("/themBV")
    public String add() {
        return "admin/them-bai-viet";
    }

    @GetMapping("/xemBV")
    public String view() {
        return "admin/xem-bai-viet";
    }

    @GetMapping("/suaBV")
    public String update() {
        return "admin/sua-bai-viet";
    }

    @GetMapping("/xoaBV")
    public void delete() {

    }
}
