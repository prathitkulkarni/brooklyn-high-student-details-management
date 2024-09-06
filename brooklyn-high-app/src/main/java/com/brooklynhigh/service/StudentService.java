package com.brooklynhigh.service;

import com.brooklynhigh.model.Student;
import com.brooklynhigh.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    @Override
    public Student editStudent(Student student, Integer studentid) {
        studentRepository.save(student);
        return student;
    }

    @Override
    public void deleteStudent(Integer studentid) {
        studentRepository.deleteById(studentid);
    }

    @Override
    public Optional<Student> find(Integer studentid) {
        return (studentRepository.findById(studentid));
    }

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }
}
