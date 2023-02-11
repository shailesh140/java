package com.aps.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
	
	@GetMapping(value = "/")
	public String getHome() {
		return "home";
	}

}
