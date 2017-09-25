package com.naresh.courseservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("courses")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("/list")
	public List<String> index(){
		return courseService.list();
	}
}
