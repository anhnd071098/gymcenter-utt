package com.example.gymcenter.repositories;

import com.example.gymcenter.entities.NguoiQuanTri;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiQuanTriRepository extends JpaRepository<NguoiQuanTri,Integer> {
}
