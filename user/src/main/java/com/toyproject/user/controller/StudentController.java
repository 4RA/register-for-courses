package com.toyproject.user.controller;

import com.toyproject.user.domain.student.Student;
import com.toyproject.user.dto.SignUpRequestDto;
import com.toyproject.user.service.ResponseService;
import com.toyproject.user.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
    private final ResponseService responseService;

    /**
     * 회원가입 페이지 이동
     *
     * @return
     */
    @GetMapping("/students/new")
    public String registerForm(Model model) {
        model.addAttribute("signUpRequestDto", new SignUpRequestDto());
        return "login/register";
    }

    /**
     * 회원가입
     *
     * @param requestDto
     * @param result
     * @return
     */
    @PostMapping("/students/new")
    public String saveStudent(@Valid SignUpRequestDto requestDto, BindingResult result, Model model) {
        System.out.println("requestDto.toString() = " + requestDto.toString());
        if(result.hasErrors()){
//            model.addAttribute("signUpRequestDto", requestDto);
            return "login/register";
        }

        Student student = Student.builder()
                .studentId(requestDto.getStudentId())
                .password(requestDto.getPassword())
                .name(requestDto.getName())
                .email(requestDto.getEmail())
                .phone(requestDto.getPhone())
                .major(requestDto.getMajor())
                .grade(requestDto.getGrade())
                .semester(requestDto.getSemester()).build();

        studentService.save(student);

        return "redirect:../main";
    }
}