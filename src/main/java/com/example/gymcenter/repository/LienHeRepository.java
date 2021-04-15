package com.example.gymcenter.repository;

import com.example.gymcenter.entity.LienHe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LienHeRepository extends JpaRepository<LienHe,Integer> {
}
