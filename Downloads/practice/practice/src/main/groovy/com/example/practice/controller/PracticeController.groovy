package com.example.practice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PracticeController {
	
	@GetMapping('/')
	def hello() {
		return "Hiiiiii Prem"
	}
	
}
