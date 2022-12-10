package com.spring.springCourse;

import com.spring.springCourse.persistence.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCourseApplication.class, args);

		Product p = new Product();
		p.setName("juanitooooo");
		System.out.println(p.getName());
	}

}
