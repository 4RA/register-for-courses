package com.toyproject.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {

    @GetMapping("/register")
    public String register(){
        return "login/register";
    }


    /**
     *
     * @return 로그인 페이지
     */
    @GetMapping("/login")
    public String login(){
        return "login/login";
    }
}
