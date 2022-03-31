package com.toyproject.user.domain.student;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "student_id", nullable = false)
    private String studentId; // 학번

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = true)
    private String phone;

    @Column(nullable = false)
    private String major; // 학과

    @Column(nullable = false)
    private int grade; // 학년

    @Column(nullable = false)
    private int semester; // 학기

    @Column(nullable = true)
    private int credit; // 학점

    @Column(nullable = true)
    private Role role;


}
