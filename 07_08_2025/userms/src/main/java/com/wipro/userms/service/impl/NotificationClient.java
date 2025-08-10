package com.wipro.userms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.wipro.userms.dto.NotificationDTO;
import com.wipro.userms.dto.NotificationUserDTO;
import com.wipro.userms.entity.User;

@Component
public class NotificationClient {
	
	@Autowired
	RestTemplate restTemplate;
	
	public void sendNotification(User user, String action) {
		NotificationUserDTO notificationUser = new NotificationUserDTO();
		
		notificationUser.setUserName(user.getUserName());
		notificationUser.setUserPassword(user.getUserPassword());
		notificationUser.setAddress(user.getAddress());
		
		NotificationDTO dto = new NotificationDTO();
		dto.setUser(notificationUser);
		dto.setAction(action);
		
		restTemplate.postForObject("http://notificationms/notify", dto, String.class);
		
	}
}
