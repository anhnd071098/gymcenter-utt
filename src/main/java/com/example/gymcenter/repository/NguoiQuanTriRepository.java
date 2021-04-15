package com.example.gymcenter.repository;

import com.example.gymcenter.entity.NguoiQuanTri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiQuanTriRepository extends JpaRepository<NguoiQuanTri,Integer> {
}
