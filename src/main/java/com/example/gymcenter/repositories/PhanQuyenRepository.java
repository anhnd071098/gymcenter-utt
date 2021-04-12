package com.example.gymcenter.repositories;

import com.example.gymcenter.entities.PhanQuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhanQuyenRepository extends JpaRepository<PhanQuyen,Integer> {
}
