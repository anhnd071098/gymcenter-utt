package com.example.gymcenter.services;

import com.example.gymcenter.request.TaiKhoanUser;
import org.springframework.ui.Model;

public interface UserService {
    String showCreateUser(Model model);

    String saveUser(TaiKhoanUser taiKhoanUser);
}
