package com.example.gymcenter.services.impl;

import com.example.gymcenter.dto.BaiVietDTO;
import com.example.gymcenter.entity.BaiViet;
import com.example.gymcenter.repository.BaiVietRepository;
import com.example.gymcenter.services.BaiVietService;
import com.example.gymcenter.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static com.example.gymcenter.utils.Constant.POST_UPLOAD;
import static com.example.gymcenter.utils.Constant.POST_UPLOAD_LOCATION;

@Service
public class BaiVietServiceImpl implements BaiVietService {

    @Autowired
    private BaiVietRepository baiVietRepository;

    @Override
    public String savePost(BaiVietDTO baiVietDTO) {
        if (baiVietDTO !=null){
            BaiViet baiViet = new BaiViet();
            baiViet.setTenBaiViet(baiVietDTO.getTenBaiViet());
            baiViet.setNoiDungBaiViet(baiVietDTO.getNoiDungBaiViet());
            baiViet.setNgayTao(new Date());
            baiViet.setTomtat(baiVietDTO.getTomtat());
            baiViet.setHinhAnh(Utils.createImages(baiVietDTO.getHinhAnh(), POST_UPLOAD, POST_UPLOAD_LOCATION));
            baiVietRepository.save(baiViet);
            return "redirect:/admin/xemBV";
        }
        return "redirect:/error/404";
    }

    @Override
    public String addPost(Model model) {
        model.addAttribute("baiVietDTO", new BaiVietDTO());
        return "admin/them-bai-viet";
    }

    @Override
    public String viewPost(Model model) {
        List<BaiViet> posts = baiVietRepository.findAll();
        if (posts.isEmpty()){
            return "redirect:/error/404";
        }
        model.addAttribute("posts", posts);
        return "admin/xem-bai-viet";
    }

    @Override
    public String editPost(Integer id, Model model) {
        Optional<BaiViet> baiViet = baiVietRepository.findById(id);
        baiViet.ifPresent(bV -> model.addAttribute("baiViet", baiViet));
        return "admin/sua-bai-viet";
    }

    @Override
    public String savePostEdit(BaiVietDTO baiVietDTO) {
        BaiViet baiViet = baiVietRepository.findByID(baiVietDTO.getID());
        if (baiViet!=null){
            baiViet.setTenBaiViet(baiVietDTO.getTenBaiViet());
            baiViet.setNoiDungBaiViet(baiVietDTO.getNoiDungBaiViet());
            baiViet.setTomtat(baiVietDTO.getTomtat());
            baiViet.setHinhAnh(Utils.createImages(baiVietDTO.getHinhAnh(), "postedit", POST_UPLOAD_LOCATION));
            baiViet.setNgayTao(new Date());
            baiVietRepository.save(baiViet);
            return "redirect:/admin/xemBV";
        }
        return "redirect:/error/404";
    }

    @Override
    public String deletePost(int id) {
        BaiViet baiViet = baiVietRepository.findByID(id);
        if (baiViet!=null){
            baiVietRepository.delete(baiViet);
            return "redirect:/admin/xemBV";
        }
        return "redirect:/error/404";
    }

    @Override
    public String findBV(String term, Model model) {
        List<BaiViet> list = baiVietRepository.findByTenBaiVietContaining(term);
        if (!list.isEmpty()){
            model.addAttribute("posts", list);
            return "admin/xem-bai-viet";
        }
        return "redirect:/error/404";
    }
}
