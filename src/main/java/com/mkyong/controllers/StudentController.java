package com.mkyong.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mkyong.model.Student;

@Controller
public class StudentController {

	@Value("${app.student.title}")
	private String STUDENTTITLE = "";

	private Student student = new Student("Popescu", "Ion");

	@RequestMapping("/student")
	public String obtainStudent(Map<String, Object> model) {
		model.put("title", STUDENTTITLE);
		model.put("name", student.getName());
		model.put("lastName", student.getLastName());
		return "student";
	}

}
