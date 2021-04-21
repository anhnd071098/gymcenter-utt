package com.example.gymcenter.controller;

import com.example.gymcenter.entity.BaiViet;
import com.example.gymcenter.entity.LienHe;
import com.example.gymcenter.request.LienHeRequest;
import com.example.gymcenter.services.LienHeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class LienHeController {
    @Autowired
    private LienHeService lienHeService;
    @GetMapping("/lienhe")
    public String lienHe(Model model) {
        model.addAttribute("lienHe",new LienHeRequest());
        return "user/contact";
    }
    @PostMapping("/lienhe")
    public String luuLienHe(@ModelAttribute("lienhe") LienHeRequest lienHe){
        return lienHeService.luuLienHe(lienHe);
    }
}

