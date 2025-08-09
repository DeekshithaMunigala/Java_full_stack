package com.wipro.learnsubjectproducer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.learnsubjectproducer.service.LearnSubjectService;

@Service
public class LearnSubjectServiceImpl implements LearnSubjectService {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	@Override
	public void sendLearnSubjectData(String subjectCode, String subject) {
		String message = "SubjectCode: " + subjectCode + ", Subject: " + subject;
		kafkaTemplate.send("learn-subject", message);

	}

}
