package com.datdev.k8sspringbootseries.Service;

import com.datdev.k8sspringbootseries.dto.StudentDto;
import com.datdev.k8sspringbootseries.entity.Student;

import java.util.List;

public interface IStudentService {
    public Student createStudent(StudentDto student);
    public List<Student> getAll();
}
