package com.ohgiraffers.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("nickname")
public class MainController {

    @PostMapping("/main")
    public String main(@RequestParam("nickname") String nickname, Model model) {
        model.addAttribute("nickname", nickname);
        return "main/main";
    }
}
