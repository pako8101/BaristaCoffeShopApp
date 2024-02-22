package com.example.baristacoffeshopapp.web;

import com.example.baristacoffeshopapp.sec.CurrentUser;
import com.example.baristacoffeshopapp.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {

    private final CurrentUser currentUser;
    private final OrderService orderService;

    public HomeController(CurrentUser currentUser, OrderService orderService) {
        this.currentUser = currentUser;
        this.orderService = orderService;
    }

    @GetMapping()
    public String index(Model model){

        if (currentUser.getId()==null){
            return "index";
        }
        model.addAttribute("orders",orderService.findAllOrdersByPriceDesc());
        return "home";
    }
}
