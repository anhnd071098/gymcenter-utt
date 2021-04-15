package com.example.gymcenter.repository;

import com.example.gymcenter.entity.BaiViet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaiVietRepository extends JpaRepository<BaiViet,Integer> {
}
