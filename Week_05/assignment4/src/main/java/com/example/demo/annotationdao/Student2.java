package com.example.demo.annotationdao;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
public class Student2 implements Serializable {
    
    private int id;
    private String name;

}
