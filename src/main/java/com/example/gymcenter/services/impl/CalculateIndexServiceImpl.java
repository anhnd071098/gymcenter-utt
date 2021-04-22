package com.example.gymcenter.services.impl;

import com.example.gymcenter.request.CalculateIndexRequest;
import com.example.gymcenter.services.CalculateIndexService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class CalculateIndexServiceImpl implements CalculateIndexService {
    @Override
    public String Calculate(CalculateIndexRequest calculateIndexRequest, Model model) {
        float bMI = calculateIndexRequest.getWeight()/((calculateIndexRequest.getHeight()*calculateIndexRequest.getHeight())/10000);
        model.addAttribute("BMI",bMI);
        Integer k;
        if(calculateIndexRequest.getSex()==1)
            k=5;
        else
            k=-165;
        float bRM = (float) ((9.99*calculateIndexRequest.getWeight())+(6.25*calculateIndexRequest.getHeight())-(4.92*calculateIndexRequest.getAge())-k);
        model.addAttribute("BRM",bRM);
        double r=0;
        switch (calculateIndexRequest.getActivity())
        {
            case 1: r=1.2; break;
            case 2: r=1.375; break;
            case 3: r=1.55;break;
            case 4: r=1.725;break;
            case 5: r=1.9; break;
            default:
        }
        float tDEE= (float) (bRM*r);
        model.addAttribute("TDEE",tDEE);
        if(bMI>0&bMI<18.5){
            model.addAttribute("textBMI","Bạn đang thiếu cân");
        }
        else if(bMI>=18.5&&bMI<25){
            model.addAttribute("textBMI","Thể Trạng Bình Thường");
        }
        else if(bMI>=25&&bMI<30){
            model.addAttribute("textBMI","Thể trạng : Tiền Béo Phì");
        }
        else if(bMI>=30&&bMI<35)
        {
            model.addAttribute("textBMI","Thể trạng : Béo phì độ 1");
        }
        else if(bMI>=35&&bMI<40)
        {
            model.addAttribute("textBMI","Thể trạng : Béo phì độ 2");
        }
        else if (bMI>=40){
            model.addAttribute("textBMI","Thể trạng : Béo phì độ 3");
        }
        else {
            model.addAttribute("textBMI","thông tin không chính xác");
        }
        return "user/tinhchiso";
    }
}
