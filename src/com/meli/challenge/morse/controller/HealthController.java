package com.meli.challenge.morse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthController {

	@GetMapping("/health")
	public String index() {
		return "Aplicação ativa!!!";
	}

}