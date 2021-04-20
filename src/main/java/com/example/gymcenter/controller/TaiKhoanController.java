package com.example.gymcenter.controller;

import com.example.gymcenter.request.TaiKhoanUser;
import com.example.gymcenter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/user")
public class TaiKhoanController {
    @Autowired
    private UserService userService;
    @GetMapping("/dangnhap")
    public String dangNhap() {
        return "user/dang-nhap";
    }

    @PostMapping("/saveUser")
    public String saveUser(@Valid @ModelAttribute("user")TaiKhoanUser taiKhoanUser ){
        return userService.saveUser(taiKhoanUser);
    }

    @GetMapping("/taoTK")
    public String taoTK(Model model) {
        return userService.showCreateUser(model);
    }
}
