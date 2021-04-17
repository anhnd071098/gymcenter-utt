package com.example.gymcenter.utils;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class Utils {
    public static String createImages(MultipartFile imageRequest, String nameCategory, String folderSave) {
        if (!imageRequest.isEmpty()) {
            String fileName = nameCategory +"- " + imageRequest.getOriginalFilename();
            try {
                FileCopyUtils.copy(imageRequest.getBytes(), new File(folderSave + fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return fileName;
        }
        return "redirect:/error/404";
    }
}
