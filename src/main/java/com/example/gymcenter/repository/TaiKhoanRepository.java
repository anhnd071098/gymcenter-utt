package com.example.gymcenter.repository;

import com.example.gymcenter.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, Long> {
    List<TaiKhoan> findByTenNguoiDungContaining(String term);

    TaiKhoan findByID(Long id);

    TaiKhoan findByEmail(String email);
}
