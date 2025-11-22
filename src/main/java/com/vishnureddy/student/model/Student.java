package com.vishnureddy.student.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "enrollment_number")
})
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
    @Column(unique = true)
    private String enrollmentNumber;
    private String course;
    private Integer yearOfStudy;

    public Student() {}

    // getters/setters
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public LocalDate getDob() {return dob;}
    public void setDob(LocalDate dob) {this.dob = dob;}
    public String getEnrollmentNumber() {return enrollmentNumber;}
    public void setEnrollmentNumber(String en) {this.enrollmentNumber = en;}
    public String getCourse() {return course;}
    public void setCourse(String course) {this.course = course;}
    public Integer getYearOfStudy() {return yearOfStudy;}
    public void setYearOfStudy(Integer yos) {this.yearOfStudy = yos;}
}
