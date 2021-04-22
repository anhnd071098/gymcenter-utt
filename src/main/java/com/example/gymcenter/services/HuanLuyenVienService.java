package com.example.gymcenter.services;

import com.example.gymcenter.entity.HuanLuyenVien;
import com.example.gymcenter.request.HuanLuyenVienRequest;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

public interface HuanLuyenVienService {
    String addTrainer(Model model);
    String saveHLV(HuanLuyenVienRequest huanLuyenVienRequest);
    List<HuanLuyenVien> findAllHLV();
    Optional<HuanLuyenVien> timKiem(Integer id);
    void delete(Integer id);
    List<HuanLuyenVien>  search(String term);
}
