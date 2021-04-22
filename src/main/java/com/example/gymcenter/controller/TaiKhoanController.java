package com.example.gymcenter.controller;

import com.example.gymcenter.dto.TaiKhoanDTO;
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
@RequestMapping(value = "/registration")
public class TaiKhoanController {

    @ModelAttribute("user")
    public TaiKhoanDTO taiKhoanDto() {
        return new TaiKhoanDTO();
    }
    @Autowired
    private UserService userService;

    @PostMapping
    public String saveUser(@Valid @ModelAttribute("user") TaiKhoanDTO taiKhoanDTO){
        return userService.saveUser(taiKhoanDTO);
    }
    @GetMapping
    public String taoTK(Model model) {
        return userService.showCreateUser(model);
    }
}
