package com.example.gymcenter.repositories;

import com.example.gymcenter.entities.HuanLuyenVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HuanLuyenVienRepository extends JpaRepository<HuanLuyenVien,Integer> {
}
