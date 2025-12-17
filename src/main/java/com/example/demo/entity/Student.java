package com.example.demo.entity;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String name;
    private String dept;
    private LocalDate dob;
    private Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    private Long getName(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    private Long getDept(){
        return dept;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    private Long getDob(){
        return dob;
    }
    public void setDob(LocalDate dob){
        this.dob=dob;
    }
    private Long getCgpa(){
        return cgpa;
    }
    public void setcgpa(float cgpa){
        this.cgpa=cgpa;
    }
    public Student(){

    }
    public Student
}