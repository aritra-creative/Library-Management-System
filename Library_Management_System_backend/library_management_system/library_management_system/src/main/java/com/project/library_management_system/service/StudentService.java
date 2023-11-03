package com.project.library_management_system.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.library_management_system.entity.Student;
import com.project.library_management_system.models.StudentModel;
import com.project.library_management_system.repositary.StudentRepositary;

public class StudentService {
    @Autowired
    private StudentRepositary studentRepositary;

    public StudentModel createStudent(StudentModel studentModel) {
        Student student = new Student();
        BeanUtils.copyProperties(studentModel, student);
        studentRepositary.save(student);
        return studentModel;
    }

    public List<StudentModel> getAllStudent() {
        List<Student> student = studentRepositary.findAll();

        List<StudentModel> studentModels = student.stream()
                .map(std -> new StudentModel(
                        std.getId(),
                        std.getName(),
                        std.getDept(),
                        std.getRollNumber(),
                        std.getEmail(),
                        std.getMobileNumber()))
                .collect(Collectors.toList());
        return studentModels;
    }

    public boolean deleteStudent(int id) {
        Student student = studentRepositary.findById(id).get();
        studentRepositary.delete(student);
        return true;

    }

    public StudentModel getStudentById(int id) {
        Student student = studentRepositary.findById(id).get();
        StudentModel studentModel = new StudentModel();
        BeanUtils.copyProperties(student, studentModel);
        return studentModel;
    }

}
