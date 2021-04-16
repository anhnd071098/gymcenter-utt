package com.example.gymcenter.services.serviceImpl;

import com.example.gymcenter.entity.TaiKhoan;
import com.example.gymcenter.repository.TaiKhoanRepository;
import com.example.gymcenter.services.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;
    @Override
    public String save(TaiKhoan taiKhoan) {
        if (taiKhoan.getTenNguoiDung().equals("")||taiKhoan.getEmail().equals("")||taiKhoan.getDiaChi().equals("")||taiKhoan.getEmail().equals("")||taiKhoan.getSoDienThoai().equals("")||taiKhoan.getMatKhau().equals("")||taiKhoan.getTuoi()==null)
            return "admin/pages-404";
        else {
            taiKhoanRepository.save(taiKhoan);
            return "redirect:/admin/xemND";
        }
    }

    @Override
    public List<TaiKhoan> getList() {
        return taiKhoanRepository.findAll();
    }

    @Override
    public TaiKhoan findOne(Integer id) {
        return taiKhoanRepository.getOne(id);
    }

    @Override
    public void delete(Integer id) {
        taiKhoanRepository.deleteById(id);
    }


}
