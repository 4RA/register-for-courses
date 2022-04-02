package com.toyproject.user.repository;

import com.toyproject.user.domain.student.Student;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Student, Long> {
    @EntityGraph(attributePaths = "authorities")
    Optional<Student> findOneWithAuthoritiesByStudentId(String studentId);

}
