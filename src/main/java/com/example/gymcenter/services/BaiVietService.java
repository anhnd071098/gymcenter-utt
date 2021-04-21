package com.example.gymcenter.services;

import com.example.gymcenter.entity.BaiViet;
import com.example.gymcenter.request.BaiVietRequest;
import org.springframework.ui.Model;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface BaiVietService {
    String savePost(BaiVietRequest baiVietRequest);

    String addPost(Model model);

    String viewPost(Model model);

    String editPost(Integer id, Model model);

    String savePostEdit(BaiVietRequest baiVietRequest);

    String deletePost(int id);

    String findBV(String term, Model model);

    String viewPostUser(Model model);

    String viewOnePost(Integer id,Model model);

    String searchBlog(String term,Model model);
}
