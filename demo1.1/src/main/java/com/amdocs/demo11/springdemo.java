package com.amdocs.demo11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springdemo {
@GetMapping("/get")
public String show() {
	String newline = System.getProperty("line.seprator");
	String str1 = "Name : Shreya Chandak";
	String str2 = "Unit :AQE," + '\n' + "email: shreya.chandak@amdocs.com";
	String a = str1+ newline +str2;
	return a;
}
}
