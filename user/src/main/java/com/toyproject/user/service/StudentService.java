package com.toyproject.user.service;

import com.toyproject.user.domain.student.Student;
import com.toyproject.user.repository.StudentRepository;
import com.toyproject.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true) // 읽기 전용(ex. select)에는 readOnly를 넣어주는 게 좋다.
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final UserRepository userRepositoryImpl;


    @Transactional
    public Long save(Student student){
        validateDuplicateStudent(student); // 중복 회원 검증
        studentRepository.save(student);
        return student.getId();
    }

    private void validateDuplicateStudent(Student student){
        List<Student> findStudent = studentRepository.findByStudentId(student.getStudentId());
        if(!findStudent.isEmpty()){
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }

    }
}
