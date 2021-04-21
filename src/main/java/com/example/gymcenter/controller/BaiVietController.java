package com.example.gymcenter.controller;

import com.example.gymcenter.services.BaiVietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.PathParam;

@Controller
public class BaiVietController {
    @Autowired
    BaiVietService baiVietService;
    @GetMapping("/baiviet")
    public String home(Model model) {
        return baiVietService.viewPostUser(model);
    }
    @GetMapping("/xemMotBaiViet/{id}")
    public String viewOnePost(@PathVariable("id") Integer id, Model model) {
        return baiVietService.viewOnePost(id, model);
    }
    @GetMapping("/blog/search")
    public String searchBlog(@PathParam("term") String term, Model model){
        return baiVietService.searchBlog(term,model);
    }

}
