package com.wipro.notificationms;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.notificationms.dto.NotificationDTO;

@RestController
@RequestMapping("/notify")
public class NotificationController {
	
	@PostMapping
	 ResponseEntity<String> notify(@RequestBody NotificationDTO notification) {
		String message = String.format("User %s information is %s", notification.getUser().getUserName(), notification.getAction());
		
		System.out.println(message);
		
		return ResponseEntity.ok("Notification received");
	}

}
