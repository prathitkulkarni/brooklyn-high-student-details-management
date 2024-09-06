package com.brooklynhigh.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentid")
    private Integer studentid;

    @Column(name = "name")
    private String name;

    @Column(name = "standard")
    private Integer standard;

    @Column(name = "marksone")
    private Integer marksOne;

    @Column(name = "markstwo")
    private Integer marksTwo;

    @Column(name = "marksthree")
    private Integer marksThree;

    @Column(name = "marksfour")
    private Integer marksFour;

    @Column(name = "marksfive")
    private Integer marksFive;

    @Column(name = "markssix")
    private Integer marksSix;

    public Student() {
    }

    public Student(String name, Integer standard, Integer marksOne,
                   Integer marksTwo, Integer marksThree, Integer marksFour,
                   Integer marksFive, Integer marksSix) {
        this.name = name;
        this.standard = standard;
        this.marksOne = marksOne;
        this.marksTwo = marksTwo;
        this.marksThree = marksThree;
        this.marksFour = marksFour;
        this.marksFive = marksFive;
        this.marksSix = marksSix;
    }


    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    public Integer getMarksOne() {
        return marksOne;
    }

    public void setMarksOne(Integer marksOne) {
        this.marksOne = marksOne;
    }

    public Integer getMarksTwo() {
        return marksTwo;
    }

    public void setMarksTwo(Integer marksTwo) {
        this.marksTwo = marksTwo;
    }

    public Integer getMarksThree() {
        return marksThree;
    }

    public void setMarksThree(Integer marksThree) {
        this.marksThree = marksThree;
    }

    public Integer getMarksFour() {
        return marksFour;
    }

    public void setMarksFour(Integer marksFour) {
        this.marksFour = marksFour;
    }

    public Integer getMarksFive() {
        return marksFive;
    }

    public void setMarksFive(Integer marksFive) {
        this.marksFive = marksFive;
    }

    public Integer getMarksSix() {
        return marksSix;
    }

    public void setMarksSix(Integer marksSix) {
        this.marksSix = marksSix;
    }
}
