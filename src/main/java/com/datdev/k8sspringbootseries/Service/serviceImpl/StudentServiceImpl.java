package com.datdev.k8sspringbootseries.Service.serviceImpl;

import com.datdev.k8sspringbootseries.Service.IStudentService;
import com.datdev.k8sspringbootseries.dto.StudentDto;
import com.datdev.k8sspringbootseries.entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final List<Student> STUDENTS = new ArrayList<>();

    @Override
    public Student createStudent(StudentDto request) {
        Student student = Student.createFrom(request);
        STUDENTS.add(student);
        return objectMapper.convertValue(student, Student.class);
    }

    @Override
    public List<Student> getAll() {
        List<Student> studentRespList = new ArrayList<>();
        for (Student student : STUDENTS) {
            Student studentResp = objectMapper.convertValue(student, Student.class);
            studentRespList.add(studentResp);
        }
        return studentRespList;
    }
}
