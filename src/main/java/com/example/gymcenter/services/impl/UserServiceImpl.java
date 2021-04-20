package com.example.gymcenter.services.impl;

import com.example.gymcenter.repository.TaiKhoanRepository;
import com.example.gymcenter.request.TaiKhoanUser;
import com.example.gymcenter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TaiKhoanRepository taiKhoanRepository;
    @Override
    public String showCreateUser(Model model) {
        model.addAttribute("user", new TaiKhoanUser());
        return "user/tao-tai-khoan";
    }

    @Override
    public String saveUser(TaiKhoanUser taiKhoanUser) {

        return null;
    }
}
