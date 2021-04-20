package com.example.gymcenter.services.impl;

import com.example.gymcenter.entity.TaiKhoan;
import com.example.gymcenter.repository.TaiKhoanRepository;
import com.example.gymcenter.services.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    @Override
    public String addAdmin(Model model) {
        model.addAttribute("taikhoan", new TaiKhoan());
        return "admin/them-nguoi-dung";
    }

    @Override
    public String saveAdmin(TaiKhoan taiKhoan) {
        if (taiKhoan.getTenNguoiDung().equals("") ||
                taiKhoan.getDiaChi().equals("") ||
                taiKhoan.getEmail().equals("") ||
                taiKhoan.getSoDienThoai().equals("") ||
                taiKhoan.getMatKhau().equals("") ||
                taiKhoan.getTuoi() == null)
            return "redirect:/error/404";
        else {
            taiKhoan.setIDAdmin(1);
            taiKhoanRepository.save(taiKhoan);
            return "redirect:/admin/view";
        }
    }

    @Override
    public String viewAdmin(Model model) {
        List<TaiKhoan> taiKhoanList = taiKhoanRepository.findAll();
        if (!taiKhoanList.isEmpty()) {
            model.addAttribute("taiKhoan", taiKhoanList);
            return "admin/xem-nguoi-dung";
        }
        return "redirect:/error/404";
    }

    @Override
    public String updateAdmin(Integer id, Model model) {
        TaiKhoan taiKhoan = taiKhoanRepository.findByID(id);
        model.addAttribute("taiKhoan1", taiKhoan);
        return "admin/sua-nguoi-dung";
    }

    @Override
    public String deleteAdmin(Integer id) {
        TaiKhoan taiKhoan = taiKhoanRepository.findByID(id);
        if (taiKhoan != null) {
            taiKhoanRepository.delete(taiKhoan);
            return "redirect:/admin/view";
        }
        return "redirect:/error/404";
    }

    @Override
    public String searchTaiKhoan(String term, Model model) {
        if (StringUtils.isEmpty(term)) {
            return "redirect:/error/404";
        } else {
            List<TaiKhoan> taiKhoanList = taiKhoanRepository.findByTenNguoiDungContaining(term);
            if (taiKhoanList.isEmpty()) {
                return "redirect:/error/404";
            }
            model.addAttribute("taiKhoan", taiKhoanList);
            return "admin/xem-nguoi-dung";
        }
    }
}
