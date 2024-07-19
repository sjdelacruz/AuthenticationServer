package com.authentication.server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${uri.endpoints.base-path}")
public class UserController {

	@GetMapping(value="${uri.endpoints.users.profile}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public ResponseEntity<String> userProfile() {
		return ResponseEntity.ok("Welcome to User Profile");
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome this endpoint is not secure";
	}

	@GetMapping("/admin/adminProfile")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String adminProfile() {
		return "Welcome to Admin Profile";
	}
}
