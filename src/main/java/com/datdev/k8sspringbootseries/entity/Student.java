package com.datdev.k8sspringbootseries.entity;

import com.datdev.k8sspringbootseries.dto.StudentDto;
import com.datdev.k8sspringbootseries.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private UUID id;
    private String fullName;
    private String dateOfBirth;
    private String hometown;
    private Gender gender;

    public static Student createFrom(StudentDto request) {
        Student student = new Student();
        student.setId(UUID.randomUUID());
        student.setFullName(request.getFullName());
        student.setDateOfBirth(request.getDateOfBirth());
        student.setHometown(request.getHometown());
        student.setGender(request.getGender());
        return student;
    }

}
