package com.example.gymcenter.services;

import com.example.gymcenter.entity.TaiKhoan;
import org.springframework.ui.Model;

public interface TaiKhoanService {
    String addAdmin(Model model);
    String saveAdmin(TaiKhoan taiKhoan);
    String viewAdmin(Model model);
    String updateAdmin(Long id, Model model);
    String deleteAdmin(Long id);
    String searchTaiKhoan(String term, Model model);
}
