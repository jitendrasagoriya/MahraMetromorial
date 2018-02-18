package com.jitendra.mehra.endpoint;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jitendra.mehra.domin.Order;

@Secured("ROLE_USER")
@RequestMapping("/api/order")
@RestController
public class OrderEndpoint {

	@PostMapping
	@PreAuthorize("hasPermission(#order, 'place-order')")
	Map<String, Object> greet(Order order) {

		Map<String, Object> map = new HashMap<>();
		map.put("orderId", UUID.randomUUID());
		return map;
	}
}
