package com.example.gymcenter.repositories;

import com.example.gymcenter.entities.LienHe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LienHeRepository extends JpaRepository<LienHe,Integer> {
}
