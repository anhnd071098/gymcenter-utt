package com.example.gymcenter.repositories;

import com.example.gymcenter.entities.HopDong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopDongRepository extends JpaRepository<HopDong,Integer> {
}
