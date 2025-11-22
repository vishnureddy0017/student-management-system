package com.vishnureddy.student.repository;

import com.vishnureddy.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByEmail(String email);
    Optional<Student> findByEnrollmentNumber(String enrollment);
}
