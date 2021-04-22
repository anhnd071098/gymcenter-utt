package com.example.gymcenter.services;

import com.example.gymcenter.request.LienHeRequest;
import org.springframework.ui.Model;

public interface LienHeService {
    String luuLienHe(LienHeRequest lienHe);
}
