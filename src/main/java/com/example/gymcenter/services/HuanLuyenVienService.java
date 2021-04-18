package com.example.gymcenter.services;

import com.example.gymcenter.entity.HuanLuyenVien;

import java.util.List;
import java.util.Optional;

public interface HuanLuyenVienService {
    void saveHLV(HuanLuyenVien huanLuyenVien);
    List<HuanLuyenVien> lHLV();
    Optional<HuanLuyenVien> timKiem(Integer id);
    void delete(Integer id);
    List<HuanLuyenVien>  search(String term);
}
