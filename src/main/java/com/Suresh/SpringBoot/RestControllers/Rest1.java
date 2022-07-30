package com.Suresh.SpringBoot.RestControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest1 {

	@GetMapping("/get/{name}")
	public String getMessage(@PathVariable String name) {
		String msg ="good morning    " +      name;
		return msg;
	}
}
