package com.example.gymcenter.services.impl;

import com.example.gymcenter.entity.HuanLuyenVien;
import com.example.gymcenter.repository.HuanLuyenVienRepository;
import com.example.gymcenter.services.HuanLuyenVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HuanLuyenVienServiceImpl implements HuanLuyenVienService {
    @Autowired
    HuanLuyenVienRepository huanLuyenVienRepository;
    @Override
    public void saveHLV(HuanLuyenVien huanLuyenVien) {
        huanLuyenVienRepository.save(huanLuyenVien) ;
    }

    @Override
    public List<HuanLuyenVien> lHLV() {
        return huanLuyenVienRepository.findAll();
    }

    @Override
    public Optional<HuanLuyenVien> timKiem (Integer id) {
        Optional<HuanLuyenVien> huanLuyenVien =  huanLuyenVienRepository.findById(id);
        return huanLuyenVien;
    }

    @Override
    public void delete(Integer id) {
        huanLuyenVienRepository.deleteById(id);
    }

    @Override
    public List<HuanLuyenVien> search(String term) {
        return huanLuyenVienRepository.findByTenHuanLuyenVienContaining(term);
    }


}
