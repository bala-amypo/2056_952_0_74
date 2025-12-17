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
    public void setName(Long name){
        this.name=name;
    }
    private Long getDept(){
        return dept;
    }
    public void setDept(Long dept){
        this.dept=dept;
    }
    private Long getDob(){
        return dob;
    }
    public void setDob(Long dob){
        this.dob=dob;
    }
    private Long getCgpa(){
        return cgpa;
    }
    public void setcgpa(Long cgpa){
        this.cgpa=cgpa;
    }
}