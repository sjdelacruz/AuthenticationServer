package com.authentication.server.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.server.models.muebleria.Mueble;
import com.authentication.server.services.MuebleService;

@RestController
@RequestMapping("/muebles")
public class MuebleriaController {
	
	private final MuebleService service;
	
	public MuebleriaController(MuebleService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<Mueble>> getMuebles(){
		return ResponseEntity.ok(service.getMuebles());
	}

}
