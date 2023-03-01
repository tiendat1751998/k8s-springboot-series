package com.datdev.k8sspringbootseries.dto;

import com.datdev.k8sspringbootseries.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private String fullName;
    private String dateOfBirth;
    private String hometown;
    private Gender gender;
}
