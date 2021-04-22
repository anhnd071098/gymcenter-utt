package com.example.gymcenter.controller.admin;

import com.example.gymcenter.entity.HuanLuyenVien;
import com.example.gymcenter.request.HuanLuyenVienRequest;
import com.example.gymcenter.services.HuanLuyenVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/admin")
public class HuanLuyenVienAdminController {

    @Autowired
    private HuanLuyenVienService huanLuyenVienService;

    @GetMapping("/themHLV")
    public String add(Model model) {
        return huanLuyenVienService.addTrainer(model);
    }
    @GetMapping("/xemHLV")
    public String view(Model model) {
        model.addAttribute("lHLV", huanLuyenVienService.findAllHLV());
        return "admin/xem-huan-luyen-vien";
    }
    @GetMapping("/suaHLV/{id}/edit")
    public String update(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("hLV", huanLuyenVienService.timKiem(id));
        return "admin/sua-huan-luyen-vien";
    }
    @PostMapping("/huanluyenvien/save")
    public String saveHLV(@Valid @ModelAttribute("hlv") HuanLuyenVienRequest hlv) {
        return huanLuyenVienService.saveHLV(hlv);
    }
    @GetMapping("/xoaHLV/{id}/delete")
    public String delete(@PathVariable("id") Integer id) {
        huanLuyenVienService.delete(id);
        return "redirect:/admin/xemHLV";
    }
    @GetMapping("/hlv/timkiem")
    public String search(@RequestParam("term") String term , Model model){
        if (StringUtils.isEmpty(term)) {
            return "/admin/xem-huan-luyen-vien";
        }
        else
            model.addAttribute("lHLV", huanLuyenVienService.search(term));
        return "/admin/xem-huan-luyen-vien";
    }
}
