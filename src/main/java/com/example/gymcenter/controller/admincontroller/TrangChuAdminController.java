package com.example.gymcenter.controller.admincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class TrangChuAdminController {
    @GetMapping("/trangchuadmin")
    public String home() {
        return "admin/index";
    }
}
