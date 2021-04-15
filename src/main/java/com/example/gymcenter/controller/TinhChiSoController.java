package com.example.gymcenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TinhChiSoController {
    @GetMapping("/tinhchiso")
    public String home(){
        return "user/tinhchiso";
    }
}
