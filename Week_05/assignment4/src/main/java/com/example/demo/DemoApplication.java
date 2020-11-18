package com.example.demo;

import com.example.demo.dao.Klass;
import com.example.demo.dao.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student student10 = (Student) context.getBean("student10");
		System.out.println(student10);

		Klass class1 = context.getBean(Klass.class);
		System.out.println(class1);
		// print result:
		// Student(id=10, name=sample-value)
		// Klass(students=[Student(id=10, name=sample-value), Student(id=20, name=qq)])


	}

}
