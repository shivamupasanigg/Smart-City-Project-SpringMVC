package com.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/IndexPageLoader")
	public String pageLoader()
	{
		return "IndexFolder/IndexPageLoader";
	}
	@GetMapping("/index")
	public String index()
	{
		return "IndexFolder/index";
	}

}
