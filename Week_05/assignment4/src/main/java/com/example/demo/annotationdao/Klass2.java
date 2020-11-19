package com.example.demo.annotationdao;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Klass2 {

    @Autowired
    List<Student2> students;
    
    public void dong(){
        if (students != null) {
            for (Student2 student : students) {
                System.out.println(student);
            }
        }
    }
    
}
