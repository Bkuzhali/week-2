package com.student.service;

import com.student.repository.StudentRepository;

public class StudentService {
    private StudentRepository studentRepository;

    // Setter for DI
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void displayStudent() {
        System.out.println("Student Found: " + studentRepository.getStudentName());
    }
}
