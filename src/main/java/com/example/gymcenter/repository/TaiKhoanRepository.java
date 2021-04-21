package com.example.gymcenter.repository;

import com.example.gymcenter.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, Integer> {
    List<TaiKhoan> findByTenNguoiDungContaining(String term);

    TaiKhoan findById(Long id);

    TaiKhoan findByTenNguoiDung(String userName);
    TaiKhoan findByEmail(String email);
}
