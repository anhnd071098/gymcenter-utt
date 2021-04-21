package com.example.gymcenter.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/error")
public class ErrorController {
    @GetMapping("/404")
    public String error404(){
        return "admin/pages-404";
    }
    @GetMapping("/lienhe")
    public String errorContact(){
        return "user/error/pages-404-lienhe";
    }
    @GetMapping("/huanluyenvien")
    public String errorHLV(){
        return "user/error/pages-404";
    }
}
