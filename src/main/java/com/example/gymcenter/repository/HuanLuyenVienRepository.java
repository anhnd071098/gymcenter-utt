package com.example.gymcenter.repository;

import com.example.gymcenter.entity.HuanLuyenVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HuanLuyenVienRepository extends JpaRepository<HuanLuyenVien,Integer> {
    List<HuanLuyenVien> findByTenHuanLuyenVienContaining(String term);
}
