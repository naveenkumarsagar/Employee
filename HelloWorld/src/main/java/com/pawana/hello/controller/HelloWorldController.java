package com.pawana.hello.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pawana.hello.vo.Student;

@RestController
@RequestMapping(value="/api")
public class HelloWorldController {
	
	
  @GetMapping("/wish")
	//@RequestMapping(name = "/wish",method = RequestMethod.GET )
	public String wish() {
		return "Morning";
	}


@GetMapping("/wish/{name}")
//@RequestMapping(name = "/wish",method = RequestMethod.GET )
public String wishAgain(@PathVariable("name") String name) {
	return "Morning "+name;
}

@GetMapping("/wishes")
//@RequestMapping(name = "/wish",method = RequestMethod.GET )
public String wishAgainAndAgain(@RequestParam("name") String name) {
	return "Afternoon "+name;
}

@PostMapping("/w")
public String wishStudent(@RequestBody Student student) {
	
	return "Evening "+student.getName();
}


@PostMapping("/w/students")
public List<String> wishStudents(@RequestBody List<Student> student) {
	
	return Arrays.asList("Evening "+student.get(0).getName());
}

}
