package com.example.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorRestController {
	
	@RequestMapping("/ping")
	public String ping () {
		return "Funcionando";
	}

}
