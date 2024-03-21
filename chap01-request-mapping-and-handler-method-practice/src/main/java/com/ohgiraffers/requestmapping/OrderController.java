package com.ohgiraffers.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;

@Controller
public class OrderController {

    @PostMapping("/order")
    public String order(@ModelAttribute OrderDTO orderDTO, Model model) {

        orderDTO.setOrderDate(new Date());
        model.addAttribute("order", orderDTO);
        return "/confirm";
    }
}
