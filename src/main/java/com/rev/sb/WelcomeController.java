package com.rev.sb;

import java.util.Map;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rev.service.WelcomeService;

@RestController
public class WelcomeController {
	@Autowired
	private WelcomeService service;
	
	@RequestMapping("/welcome")
	public Map<String, String> welcome() {
		return service.retreiveMessage();
	}
	
	@RequestMapping("/getASN")
	public JSONObject getASN() {
		return service.retreiveASN();
	}
	
	@RequestMapping("/getDefaultPrinter")
	public JSONObject getDefaultPrinter() {
		return service.retreiveDefaultPrinters();
	}
}


