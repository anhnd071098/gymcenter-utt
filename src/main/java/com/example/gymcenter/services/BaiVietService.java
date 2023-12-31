package com.example.gymcenter.services;

import com.example.gymcenter.dto.BaiVietDTO;
import org.springframework.ui.Model;

import java.util.List;

public interface BaiVietService {
    String savePost(BaiVietDTO baiVietDTO);

    String addPost(Model model);

    String viewPost(Model model);

    String editPost(Integer id, Model model);

    String savePostEdit(BaiVietDTO baiVietDTO);

    String deletePost(int id);

    String findBV(String term, Model model);

    String viewPostUser(Model model);

    String viewOnePost(Integer id,Model model);

    String searchBlog(String term,Model model);
}
