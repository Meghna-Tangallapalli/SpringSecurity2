package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

	/*
	 * @GetMapping("/getMsg") public String getMsg() { String msg =
	 * "Welcome to Ashok IT..."; return msg;
	 * 
	 * }
	 */

	@GetMapping("/home")
	public String home() {
		String msg = "welcome to home page";
		return msg;
	}
	
	@GetMapping("/balance")
	public String getBalance() {
		String msg = "your current balance id: 675 INR";
		return msg;
	}
	
	@GetMapping("/statement")
	public String getStatement() {
		String msg = "your statement generated and sent to your email id";
		return msg;
	}
	
	@GetMapping("/loan")
	public String getMyLoan() {
		String msg = "your loan amt due : 300000 INR";
		return msg;
	}
	
	@GetMapping("/contact")
	public String contact() {
		String msg = "thankyou for contacting customer support, we will get back to you soon";
		return msg;
	}
	
	
}
