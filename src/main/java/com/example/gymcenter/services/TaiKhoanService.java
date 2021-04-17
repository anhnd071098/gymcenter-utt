package com.example.gymcenter.services;

import com.example.gymcenter.entity.TaiKhoan;

import java.util.List;
import java.util.Optional;

public interface TaiKhoanService {
    String save(TaiKhoan taiKhoan);
    List<TaiKhoan> getList();
    Optional<TaiKhoan>  findOne(Integer id);
    void delete(Integer id);
    List<TaiKhoan> search(String term);
}
