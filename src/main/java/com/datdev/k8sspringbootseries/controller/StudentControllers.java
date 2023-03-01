package com.datdev.k8sspringbootseries.controller;

import com.datdev.k8sspringbootseries.Service.IStudentService;
import com.datdev.k8sspringbootseries.dto.StudentDto;
import com.datdev.k8sspringbootseries.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/students")
public class StudentControllers {

    private final IStudentService iStudentService;


    public StudentControllers(IStudentService iStudentService) {
        this.iStudentService = iStudentService;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody StudentDto request) {
        return new ResponseEntity<>(iStudentService.createStudent(request), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(iStudentService.getAll(), HttpStatus.OK);
    }
}

