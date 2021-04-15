package com.example.gymcenter.repository;

import com.example.gymcenter.entity.PhanQuyenNguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhanQuyenNguoiDungRepository extends JpaRepository<PhanQuyenNguoiDung,Integer> {
}
