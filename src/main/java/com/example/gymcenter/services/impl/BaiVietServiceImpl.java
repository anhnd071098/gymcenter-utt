package com.example.gymcenter.services.impl;

import com.example.gymcenter.entity.BaiViet;
import com.example.gymcenter.repository.BaiVietRepository;
import com.example.gymcenter.request.BaiVietRequest;
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
    public String savePost(BaiVietRequest baiVietRequest) {
        if (baiVietRequest!=null){
            BaiViet baiViet = new BaiViet();
            baiViet.setTenBaiViet(baiVietRequest.getTenBaiViet());
            baiViet.setNoiDungBaiViet(baiVietRequest.getNoiDungBaiViet());
            baiViet.setNgayTao(new Date());
            baiViet.setTomtat(baiVietRequest.getTomtat());
            baiViet.setHinhAnh(Utils.createImages(baiVietRequest.getHinhAnh(), POST_UPLOAD, POST_UPLOAD_LOCATION));
            baiVietRepository.save(baiViet);
            return "redirect:/admin/xemBV";
        }
        return "redirect:/error/404";
    }

    @Override
    public String addPost(Model model) {
        model.addAttribute("baiVietRequest", new BaiVietRequest());
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
    public String savePostEdit(BaiVietRequest baiVietRequest) {
        BaiViet baiViet = baiVietRepository.findByID(baiVietRequest.getID());
        if (baiViet!=null){
            baiViet.setTenBaiViet(baiVietRequest.getTenBaiViet());
            baiViet.setNoiDungBaiViet(baiVietRequest.getNoiDungBaiViet());
            baiViet.setTomtat(baiVietRequest.getTomtat());
            baiViet.setHinhAnh(Utils.createImages(baiVietRequest.getHinhAnh(), "postedit", POST_UPLOAD_LOCATION));
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
        List<BaiViet> list = baiVietRepository.findByTenBaiViet(term);
        if (list.isEmpty()){
            model.addAttribute("lists", list);
            return "redirect:/admin/xemBV";
        }
        return "redirect:/error/404";
    }
}
