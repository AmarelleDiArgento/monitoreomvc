package com.lotus.monitoreomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainCtrl {
	@RequestMapping("/")
	public String index() {
		String response = "probando, probando... Seee! :D";
		return response;
	}
}
