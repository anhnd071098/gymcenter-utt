package com.example.gymcenter.services;

import com.example.gymcenter.request.CalculateIndexRequest;
import org.springframework.ui.Model;

public interface CalculateIndexService {
    String Calculate(CalculateIndexRequest calculateIndexRequest, Model model);
}
