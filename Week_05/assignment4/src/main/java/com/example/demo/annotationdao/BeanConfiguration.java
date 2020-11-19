package com.example.demo.annotationdao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanConfiguration {
    @Bean
    public List<Student2> students() {
        List<Student2> list = new ArrayList<>();
        list.add(new Student2(0, "jack"));
        list.add(new Student2(1, "lily"));
        list.add(new Student2(2, "john"));
        return list;
    }

    @Bean
    public Klass2 getKlass2() {
        return new Klass2();
    }
}
