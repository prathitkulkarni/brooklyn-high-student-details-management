package com.brooklynhigh.controller;

import com.brooklynhigh.model.Student;
import com.brooklynhigh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/student")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping(value = "/student/{studentid}")
    public Optional<Student> find(@PathVariable Integer studentid){
        return studentService.find(studentid);
    }

    @GetMapping(value = "/students")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @PutMapping(value = "/student/{studentid}")
    public Student editStudent(@RequestBody Student student, @PathVariable Integer studentid){
        return studentService.editStudent(student, studentid);
    }

    @DeleteMapping(value = "student/{studentid}")
    public void deleteStudent(@PathVariable Integer studentid){
        studentService.deleteStudent(studentid);
        return;
    }
}
