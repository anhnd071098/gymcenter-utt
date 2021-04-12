package com.example.gymcenter.repositories;

import com.example.gymcenter.entities.BaiViet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaiVietRepository extends JpaRepository<BaiViet,Integer> {
}
