package com.example.gymcenter.controller.admin;

import com.example.gymcenter.dto.BaiVietDTO;
import com.example.gymcenter.services.BaiVietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

@Controller
@RequestMapping(value = "/admin")
public class BaiVietAdminController {

    @Autowired
    private BaiVietService baiVietService;

    @GetMapping("/themBV")
    public String addPost(Model model){
        return baiVietService.addPost(model);
    }

    @PostMapping("/themBV")
    public String savePost(@ModelAttribute("baiVietRequest") @Valid BaiVietDTO baiVietDTO) {
        return baiVietService.savePost(baiVietDTO);
    }

    @GetMapping("/xemBV")
    public String viewPost(Model model) {
        return baiVietService.viewPost(model);
    }

    @GetMapping("/suaBV/edit/{id}")
    public String findPost(@PathVariable("id") int id, Model model) {
        return baiVietService.editPost(id, model);
    }

    @GetMapping("/searchInfo")
    public String searchInfo(@PathParam("term") String term, Model model){
        return baiVietService.findBV(term, model);
    }

    @PostMapping("/suaBV")
    public String updatePost(@ModelAttribute("baiViet") BaiVietDTO baiVietDTO){
        return baiVietService.savePostEdit(baiVietDTO);
    }

    @GetMapping("/xoaBV/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        return baiVietService.deletePost(id);
    }
}
