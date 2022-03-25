package com.toyproject.user.controller.form;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class StudentForm {

    @Column(name = "student_id")
    @NotEmpty(message = "학번 입력은 필수 입니다.")
    private String studentId; // 학번

    @NotEmpty(message = "비밀번호 입력은 필수 입니다.")
    private String password;

    @NotEmpty(message = "이름 입력은 필수 입니다.")
    private String name;

    @NotEmpty(message = "이메일 입력은 필수 입니다.")
    private String email;

    private String phone;

    @NotEmpty(message = "학과 입력은 필수 입니다.")
    private String major; // 학과

    @NotEmpty(message = "학년 입력은 필수 입니다.")
    private int grade; // 학년

    @NotEmpty(message = "학기 입력은 필수 입니다.")
    private int semester; // 학기
}
