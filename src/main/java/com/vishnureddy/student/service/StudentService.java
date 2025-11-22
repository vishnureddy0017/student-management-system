package com.vishnureddy.student.service;

import com.vishnureddy.student.dto.StudentDto;
import com.vishnureddy.student.mapper.StudentMapper;
import com.vishnureddy.student.model.Student;
import com.vishnureddy.student.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentService {
    private final StudentRepository repo;
    public StudentService(StudentRepository repo) {this.repo = repo;}

    public StudentDto create(StudentDto dto) {
        repo.findByEmail(dto.getEmail()).ifPresent(s -> {throw new IllegalArgumentException("Email exists");});
        repo.findByEnrollmentNumber(dto.getEnrollmentNumber()).ifPresent(s -> {throw new IllegalArgumentException("Enrollment exists");});
        return StudentMapper.toDto(repo.save(StudentMapper.toEntity(dto)));
    }

    public List<StudentDto> getAll() {
        return repo.findAll().stream().map(StudentMapper::toDto).toList();
    }
}
