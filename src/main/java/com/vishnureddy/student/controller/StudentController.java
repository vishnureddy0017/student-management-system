package com.vishnureddy.student.controller;

import com.vishnureddy.student.dto.StudentDto;
import com.vishnureddy.student.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;
    public StudentController(StudentService service) {this.service = service;}

    @PostMapping
    public ResponseEntity<StudentDto> create(@Valid @RequestBody StudentDto dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    @GetMapping
    public ResponseEntity<List<StudentDto>> list() {
        return ResponseEntity.ok(service.getAll());
    }
}
