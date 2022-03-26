package com.toyproject.user.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public enum StatusEnum {
    SUCCESS(1, "성공!"),
    FAIL(0, "실패 ㅠㅠ");

    private int code;
    private String msg;

}
