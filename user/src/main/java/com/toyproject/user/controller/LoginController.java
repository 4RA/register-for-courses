package com.toyproject.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {

    /**
     * 회원가입 페이지
     * @return
     */
    @GetMapping("/register")
    public String register(){
        return "login/register";
    }

    /**
     * 로그인 페이지
     * @return
     */
    @GetMapping("/login")
    public String login(){
        return "login/login";
    }

    @GetMapping("find/password")
    public String findPassword(){
        return "login/forgot-password";
    }
}
