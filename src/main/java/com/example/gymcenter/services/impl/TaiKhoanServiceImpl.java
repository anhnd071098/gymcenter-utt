package com.example.gymcenter.services.impl;

import com.example.gymcenter.entity.TaiKhoan;
import com.example.gymcenter.repository.TaiKhoanRepository;
import com.example.gymcenter.services.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;
    @Override
    public String save(TaiKhoan taiKhoan) {
        if (taiKhoan==null)
            return "pages-404";
        else {
            taiKhoanRepository.save(taiKhoan);
            return "redirect:/admin/xemND";
        }
    }
}
