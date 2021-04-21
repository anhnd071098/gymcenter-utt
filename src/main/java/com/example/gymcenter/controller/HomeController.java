package com.example.gymcenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"/trangchu", "/"})
    public String home() {
        return "user/index";
    }
    @GetMapping("/login")
    public String dangNhap() {
        return "user/dang-nhap";
    }
}
