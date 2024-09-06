package com.brooklynhigh.service;

import com.brooklynhigh.model.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    public Student addStudent(Student student);
    public Student editStudent(Student student, Integer studentid);
    public void deleteStudent(Integer studentid);
    public Optional<Student> find(Integer studentid);
    public List<Student> findAll();
}
