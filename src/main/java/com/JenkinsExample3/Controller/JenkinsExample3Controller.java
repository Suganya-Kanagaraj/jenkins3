package com.JenkinsExample3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsExample3Controller {

	@GetMapping(value="/get1")
	public String get() {
		return "Done";
	}
}
