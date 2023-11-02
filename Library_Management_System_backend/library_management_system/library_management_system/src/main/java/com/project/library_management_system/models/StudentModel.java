package com.project.library_management_system.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {
    public int id;
    public String name;
    public String dept;
    public int rollNumber;
    public String email;
    public String mobileNumber;

}
