package com.in28minutes.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Create a simple REST API with the URL /courses.  http://localhost:8080/courses
// When someone hits this URL, we want to return the below data back. Course: id, name, author
//	[
//	  {
//		"id": 1,
//		"name": "Learn Spring",
//		"author": "in28minutes"
//	  }
//	]

@RestController   // Must have RestController to build a Spring REST API.
public class CourseController {
	
	// We need to map this so that when someone hits /courses, it returns this list of courses. (@RequestMapping("where mapping to"))
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
			new Course(1, "Learn Spring Boot", "in28minutes"),
			new Course(2, "Learn Spring REST API", "in28minutes"),
			new Course(3, "Learn Java", "in28minutes"),
			new Course(4, "Learn GCP", "in28minutes")
			);
	}
}
