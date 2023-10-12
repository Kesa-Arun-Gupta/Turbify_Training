package com.infinite.pharma;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayController {
	@RequestMapping("/display")
	public String insert(){
		return "Options";
	}

}
