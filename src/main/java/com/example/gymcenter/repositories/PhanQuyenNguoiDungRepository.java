package com.example.gymcenter.repositories;

import com.example.gymcenter.entities.PhanQuyenNguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhanQuyenNguoiDungRepository extends JpaRepository<PhanQuyenNguoiDung,Integer> {
}
