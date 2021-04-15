package com.example.gymcenter.controller.admincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrangChuAdminController {
    @GetMapping("/trangchuadmin")
    public String home(){
        return "admin/index";
    }
}
