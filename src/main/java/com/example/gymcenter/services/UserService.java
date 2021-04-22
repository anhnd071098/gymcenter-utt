package com.example.gymcenter.services;

import com.example.gymcenter.dto.TaiKhoanDTO;
import com.example.gymcenter.entity.TaiKhoan;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.ui.Model;

public interface UserService extends UserDetailsService {
    String showCreateUser(Model model);

    String saveUser(TaiKhoanDTO taiKhoanDTO);
}
