package com.example.gymcenter.repository;

import com.example.gymcenter.entity.BaiViet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaiVietRepository extends JpaRepository<BaiViet,Integer> {
    BaiViet findByID(Integer id);
    List<BaiViet> findByTenBaiViet(String term);
}
