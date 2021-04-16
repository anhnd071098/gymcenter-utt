package com.example.gymcenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HoiVienController {
    @GetMapping("/hoivien")
    public String home() {
        return "user/hoivien";
    }
}
