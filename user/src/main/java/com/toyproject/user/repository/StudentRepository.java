package com.toyproject.user.repository;

import com.toyproject.user.domain.student.Student;
import com.toyproject.user.dto.SignUpRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class StudentRepository {

    private final EntityManager em;

    public void save(Student student) {
        em.persist(student);
    }

    public List<Student> findByStudentId(String studentId) {
        return em.createQuery("select s from Student s where s.studentId = :student_id", Student.class)
                .setParameter("student_id", studentId)
                .getResultList();
    }



}
