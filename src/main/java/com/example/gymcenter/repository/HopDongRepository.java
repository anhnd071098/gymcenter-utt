package com.example.gymcenter.repository;

import com.example.gymcenter.entity.HopDong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopDongRepository extends JpaRepository<HopDong,Integer> {
}
