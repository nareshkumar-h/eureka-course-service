package com.naresh.courseservice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CourseService {

	@HystrixCommand(fallbackMethod="fallbackCourseList")
	public List<String> list(){
		System.out.println("Course Service ->List");
		//throw new RuntimeException("Service is Down");
		return Arrays.asList("Java", "Spring", "Hibernate");
	}
	
	private List<String> fallbackCourseList(){
		System.out.println("Course Service Fallback->List");
		return Collections.emptyList();
	}
}
