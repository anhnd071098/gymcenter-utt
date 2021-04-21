package com.example.gymcenter.controller;

import com.example.gymcenter.services.HuanLuyenVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HuanLuyenVienController {
    @Autowired
    HuanLuyenVienService huanLuyenVienService;
    @GetMapping("/huanluyenvien")
    public String viewTrainerAdmin(Model model) {
        model.addAttribute("lHLV",huanLuyenVienService.findAllHLV());
        return "user/gallery";
    }
}
