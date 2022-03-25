package com.toyproject.user.controller;

import com.toyproject.user.service.UnivService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UnivController {

    private final UnivService univService;


}
