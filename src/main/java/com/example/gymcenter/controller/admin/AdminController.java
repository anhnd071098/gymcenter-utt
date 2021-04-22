package com.example.gymcenter.controller.admin;

import com.example.gymcenter.entity.TaiKhoan;
import com.example.gymcenter.services.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private TaiKhoanService taiKhoanService;

    @GetMapping("/add")
    public String add(Model model) {
        return taiKhoanService.addAdmin(model);
    }

    @GetMapping("/view")
    public String view(Model model) {
      return taiKhoanService.viewAdmin(model);
    }

    @GetMapping("/edit/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        return taiKhoanService.updateAdmin(id, model);

    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        return taiKhoanService.deleteAdmin(id);
    }

    @PostMapping("/save")
    public String saveUser(@Valid @ModelAttribute("taikhoan") TaiKhoan taiKhoan) {
        return taiKhoanService.saveAdmin(taiKhoan);
    }

    @GetMapping("/timKiem")
    public String search(@PathParam("term") String term , Model model){
        return taiKhoanService.searchTaiKhoan(term, model);
    }
}
