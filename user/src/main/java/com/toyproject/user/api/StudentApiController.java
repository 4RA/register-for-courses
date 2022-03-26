package com.toyproject.user.api;

import com.toyproject.user.domain.student.Student;
import com.toyproject.user.dto.SignUpRequestDto;
import com.toyproject.user.dto.response.result.CommonResult;
import com.toyproject.user.service.ResponseService;
import com.toyproject.user.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class StudentApiController {

    private final StudentService studentService;
    private final ResponseService responseService;

    /**
     * 회원가입
     *
     * @param requestDto
     * @param result
     * @return
     */
    @PostMapping("/api/v1/students/new")
    public ResponseEntity<CommonResult> saveStudent(@Valid SignUpRequestDto requestDto, BindingResult result) {
        Student student = Student.builder()
                .studentId(requestDto.getStudentId())
                .password(requestDto.getPassword())
                .name(requestDto.getName())
                .email(requestDto.getEmail())
                .phone(requestDto.getPhone())
                .major(requestDto.getMajor())
                .grade(requestDto.getGrade())
                .semester(requestDto.getSemester()).build();

        if(result.hasErrors()) {
            // TODO: Exception 생성해서 exception으로 바꾸기
            return ResponseEntity.badRequest().body(responseService.getFailResult(result.getFieldError().getDefaultMessage()));
        }

        return ResponseEntity.ok().body(responseService.getSingleResult(studentService.save(student)));
    }
}
