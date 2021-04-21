package com.example.gymcenter.services.impl;

import com.example.gymcenter.entity.PhanQuyen;
import com.example.gymcenter.entity.TaiKhoan;
import com.example.gymcenter.repository.TaiKhoanRepository;
import com.example.gymcenter.dto.TaiKhoanDTO;
import com.example.gymcenter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private final TaiKhoanRepository taiKhoanRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(TaiKhoanRepository taiKhoanRepository) {
        super();
        this.taiKhoanRepository = taiKhoanRepository;
    }

    @Override
    public String showCreateUser(Model model) {
        return "user/tao-tai-khoan";
    }

    @Override
    public String saveUser(TaiKhoanDTO taiKhoanDTO) {
        TaiKhoan taiKhoan = new TaiKhoan(
                taiKhoanDTO.getName(),
                taiKhoanDTO.getEmail(),
                false,
                passwordEncoder.encode(taiKhoanDTO.getPassword()),
                Collections.singletonList(new PhanQuyen("USER"))
        );
        taiKhoanRepository.save(taiKhoan);
        return "redirect:/login";
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        TaiKhoan taiKhoan = taiKhoanRepository.findByEmail(username);
        if(taiKhoan == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(taiKhoan.getEmail(), taiKhoan.getMatKhau(), mapRolesToAuthorities(taiKhoan.getPhanQuyens()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<PhanQuyen> phanQuyens){
        return phanQuyens.stream().map(phanQuyen -> new SimpleGrantedAuthority(phanQuyen.getLoaiQuyen())).collect(Collectors.toList());
    }
}
