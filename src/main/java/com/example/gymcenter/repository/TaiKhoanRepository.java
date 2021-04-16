package com.example.gymcenter.repository;

import com.example.gymcenter.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface TaiKhoanRepository extends JpaRepository<TaiKhoan,Integer> {
    TaiKhoan findByIDAdmin(@Param("id") int id);
}
