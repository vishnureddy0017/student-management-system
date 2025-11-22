package com.vishnureddy.student.mapper;

import com.vishnureddy.student.dto.StudentDto;
import com.vishnureddy.student.model.Student;

public class StudentMapper {
    public static StudentDto toDto(Student s) {
        StudentDto d = new StudentDto();
        d.setId(s.getId());
        d.setFirstName(s.getFirstName());
        d.setLastName(s.getLastName());
        d.setEmail(s.getEmail());
        d.setDob(s.getDob());
        d.setEnrollmentNumber(s.getEnrollmentNumber());
        d.setCourse(s.getCourse());
        d.setYearOfStudy(s.getYearOfStudy());
        return d;
    }

    public static Student toEntity(StudentDto d) {
        Student s = new Student();
        s.setId(d.getId());
        s.setFirstName(d.getFirstName());
        s.setLastName(d.getLastName());
        s.setEmail(d.getEmail());
        s.setDob(d.getDob());
        s.setEnrollmentNumber(d.getEnrollmentNumber());
        s.setCourse(d.getCourse());
        s.setYearOfStudy(d.getYearOfStudy());
        return s;
    }
}
