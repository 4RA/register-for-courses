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
    public String registerForm(){
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

    /**
     * 아이디 찾기
     * @return
     */
    @GetMapping("find/id")
    public String findIdForm(){
        return "login/forgot-id";
    }

    /**
     * 비밀번호 찾기
     * @return
     */
    @GetMapping("find/password")
    public String findPasswordForm(){
        return "login/forgot-password";
    }
}
