package com.toyproject.user.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.*;


@Getter
@Setter
public class SignUpRequestDto {

    /*
        @NotNull 은 이름 그대로 Null만 허용하지 않습니다. 따라서, "" 이나 " " 은 허용
        @NotEmpty 는 null 과 "" 은 막히되, " " 은 허용
        @NotBlank @NotBlank 는 null 과 "" 과 " " 모두 허용하지 않습니다.

        숫자는 @NotNull만 가능능
    */
    private Long id;

    @NotBlank(message = "학번 입력은 필수 입니다.")
    private String studentId; // 학번

    @NotBlank(message = "비밀번호 입력은 필수 입니다.")
    private String password;

    @NotBlank(message = "이름 입력은 필수 입니다.")
    @Size(min = 1, max = 10, message = "이름은 1 ~ 10자 이여야 합니다!")
    private String name;

    @NotBlank(message = "이메일 입력은 필수 입니다.")
    @Email
    private String email;

    private String phone;

    @NotBlank(message = "학과 입력은 필수 입니다.")
    private String major; // 학과

    @NotNull(message = "학년 입력은 필수 입니다.")
    @Digits(integer = 4, fraction = 0, message = "학년 입력은 필수 입니다.")
    private int grade; // 학년

    @NotNull(message = "학기 입력은 필수 입니다.")
    @Digits(integer = 3, fraction = 0, message = "학기 입력은 필수 입니다.")
    private int semester; // 학기

    @Override
    public String toString() {
        return "SignUpRequestDto{" +
                "id=" + id +
                ", studentId='" + studentId + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", major='" + major + '\'' +
                ", grade=" + grade +
                ", semester=" + semester +
                '}';
    }
}
