package com.jitendra.mehra.endpoint;

import java.util.Collections;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/auth")
@RestController
public class AuthEndpoint {

	@GetMapping
	Map<String, Object> getToken(HttpSession session) {
		return Collections.singletonMap("session", session.getId());
	}
}
