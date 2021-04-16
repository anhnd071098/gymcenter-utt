package com.example.gymcenter.services;

import com.example.gymcenter.entity.TaiKhoan;

import java.util.List;

public interface TaiKhoanService {
    String save(TaiKhoan taiKhoan);
    List<TaiKhoan> getList();
    TaiKhoan findOne(Integer id);
    void delete(Integer id);
}
