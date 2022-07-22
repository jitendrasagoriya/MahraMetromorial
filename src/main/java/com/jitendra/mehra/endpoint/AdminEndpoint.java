package com.jitendra.mehra.endpoint;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/admin")
@RestController
public class AdminEndpoint {

	@GetMapping
	@Secured("ROLE_ADMIN")
	Map<String, Object> manage(@AuthenticationPrincipal Principal user) {
		return Collections.singletonMap("user", user.getName());
	}
}
