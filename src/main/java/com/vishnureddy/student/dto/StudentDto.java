package com.vishnureddy.student.dto;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class StudentDto {
    private Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @Email @NotBlank
    private String email;
    private LocalDate dob;
    @NotBlank
    private String enrollmentNumber;
    private String course;
    private Integer yearOfStudy;

    // getters/setters
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getFirstName() {return firstName;}
    public void setFirstName(String fn) {this.firstName = fn;}
    public String getLastName() {return lastName;}
    public void setLastName(String ln) {this.lastName = ln;}
    public String getEmail() {return email;}
    public void setEmail(String em) {this.email = em;}
    public LocalDate getDob() {return dob;}
    public void setDob(LocalDate d) {this.dob = d;}
    public String getEnrollmentNumber() {return enrollmentNumber;}
    public void setEnrollmentNumber(String e) {this.enrollmentNumber = e;}
    public String getCourse() {return course;}
    public void setCourse(String c) {this.course = c;}
    public Integer getYearOfStudy() {return yearOfStudy;}
    public void setYearOfStudy(Integer y) {this.yearOfStudy = y;}
}
