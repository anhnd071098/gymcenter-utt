package com.example.gymcenter.controller;

import com.example.gymcenter.request.CalculateIndexRequest;
import com.example.gymcenter.services.CalculateIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculateIndexController {
    @Autowired
    CalculateIndexService calculateIndexService;
    @GetMapping("/tinhchiso")
    public String CalculateIndex(Model model) {
        model.addAttribute("index",new CalculateIndexRequest());
        return "user/tinhchiso";
    }
    @PostMapping("/tinhchiso")
    public String CalculateIndex(@ModelAttribute("index") CalculateIndexRequest calculateIndexRequest, Model model){
        CalculateIndexRequest calculateIndexRequest1=calculateIndexRequest;
        return calculateIndexService.Calculate(calculateIndexRequest, model);
    }

}
