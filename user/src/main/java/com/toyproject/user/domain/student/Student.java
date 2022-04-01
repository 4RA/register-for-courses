package com.toyproject.user.domain.student;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @JsonIgnore
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_id", nullable = false)
    private String studentId; // 학번

    @JsonIgnore
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = true)
    private String phone;

    @Column(nullable = false)
    private String major; // 학과: 경영학과, 영어영문학과, 소프트웨어학부

    @Column(nullable = false)
    private int grade; // 학년

    @Column(nullable = false)
    private int semester; // 학기

    @Column(nullable = true)
    private int credit; // 학점

    @Column(name = "activated")
    private int activated;

    @ManyToMany
    @JoinTable(
            name = "user_authority",
            joinColumns = {@JoinColumn(name = "id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "authority_name")})
    private Set<Authority> authorities;
    // ManyToMany, joinTable -> User객체와 Authority객체의 다대다 관계를 일대다, 다대일 관계의 조인 테이블로 정의

}
