package com.example.gymcenter.services.impl;

import com.example.gymcenter.entity.HuanLuyenVien;
import com.example.gymcenter.repository.HuanLuyenVienRepository;
import com.example.gymcenter.request.HuanLuyenVienRequest;
import com.example.gymcenter.services.HuanLuyenVienService;
import com.example.gymcenter.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;

import static com.example.gymcenter.utils.Constant.POST_UPLOAD;
import static com.example.gymcenter.utils.Constant.POST_UPLOAD_LOCATION;

@Service
public class HuanLuyenVienServiceImpl implements HuanLuyenVienService {
    @Autowired
    HuanLuyenVienRepository huanLuyenVienRepository;

    @Override
    public String addTrainer(Model model) {
        model.addAttribute("hlv", new HuanLuyenVienRequest());
        return "admin/them-huan-luyen-vien";
    }

    @Override
    public String saveHLV(HuanLuyenVienRequest huanLuyenVienRequest) {
        if(huanLuyenVienRequest !=null){
            HuanLuyenVien huanLuyenVien=new HuanLuyenVien();
            if(huanLuyenVienRequest.getID()!=null){
                huanLuyenVien.setID(huanLuyenVienRequest.getID());
            }
            huanLuyenVien.setTenHuanLuyenVien(huanLuyenVienRequest.getTenHuanLuyenVien());
            huanLuyenVien.setTuoi(huanLuyenVienRequest.getTuoi());
            huanLuyenVien.setKinhNghiem(huanLuyenVienRequest.getKinhNghiem());
            huanLuyenVien.setThanhTich(huanLuyenVienRequest.getThanhTich());
            boolean test=huanLuyenVienRequest.getHinhAnh().isEmpty();
            if(!huanLuyenVienRequest.getHinhAnh().isEmpty()) {
                huanLuyenVien.setHinhAnh(Utils.createImages(huanLuyenVienRequest.getHinhAnh(), POST_UPLOAD, POST_UPLOAD_LOCATION));
            }
            huanLuyenVienRepository.save(huanLuyenVien) ;
            return "redirect:/admin/xemHLV";
        }
        else return "redirect:/error/huanluyenvien";
    }

    @Override
    public List<HuanLuyenVien> findAllHLV() {
        return huanLuyenVienRepository.findAll();
    }

    @Override
    public Optional<HuanLuyenVien> timKiem (Integer id) {
        Optional<HuanLuyenVien> huanLuyenVien =  huanLuyenVienRepository.findById(id);
        return huanLuyenVien;
    }

    @Override
    public void delete(Integer id) {
        huanLuyenVienRepository.deleteById(id);
    }

    @Override
    public List<HuanLuyenVien> search(String term) {
        return huanLuyenVienRepository.findByTenHuanLuyenVienContaining(term);
    }


}
