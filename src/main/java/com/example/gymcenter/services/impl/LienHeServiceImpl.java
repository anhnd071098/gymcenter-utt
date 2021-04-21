package com.example.gymcenter.services.impl;

import com.example.gymcenter.entity.LienHe;
import com.example.gymcenter.repository.LienHeRepository;
import com.example.gymcenter.request.LienHeRequest;
import com.example.gymcenter.services.LienHeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class LienHeServiceImpl implements LienHeService {
    @Autowired
    private LienHeRepository lienHeRepository;
    @Override
    public String luuLienHe(LienHeRequest lienHe) {
        if(lienHe.getNoiDung().equals("")||lienHe.getSoDienThoai().equals("")
                ||lienHe.getTenNguoiCanTuVan().equals("")){
            return "user/error/pages-404-lien-he";
        }
        else{
            LienHe lienHe1=new LienHe();
            lienHe1.setNoiDungTuVan(lienHe.getNoiDung());
            lienHe1.setSoDienThoai(lienHe.getSoDienThoai());
            lienHe1.setTenNguoiCanTuVan(lienHe.getTenNguoiCanTuVan());
            lienHeRepository.save(lienHe1);
            return "redirect:/lienhe";
        }

    }
}
