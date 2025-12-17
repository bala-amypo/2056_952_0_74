package com.example.demo.service;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;
import 
import com.example.demo.entity.Student;
public interface StudentService {
    Student poststudent (Student st);
    
}