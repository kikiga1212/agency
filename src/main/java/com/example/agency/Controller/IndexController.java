package com.example.agency.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @GetMapping
    public String index(Model model){
        // 서비스 데이터 리스트 생성
        List<Map<String, String>> services = new ArrayList<>();

        services.add(Map.of("icon", "fa-shopping-cart", "title", "E-Commerce", "desc", "전자상거래 설명..."));
        services.add(Map.of("icon", "fa-laptop", "title", "Responsive Design", "desc", "반응형 디자인 설명..."));
        services.add(Map.of("icon", "fa-lock", "title", "Web Security", "desc", "웹 보안 설명..."));

        model.addAttribute("serviceList", services); // HTML로 데이터 전달
        return "index";
    }

    @GetMapping("/test")
    public String test(){
        return "layouts/layout";
    }
}
