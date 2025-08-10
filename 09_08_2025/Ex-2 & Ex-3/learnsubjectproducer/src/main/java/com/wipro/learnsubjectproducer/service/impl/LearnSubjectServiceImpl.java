package com.wipro.learnsubjectproducer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.learnsubjectproducer.model.Subject;
import com.wipro.learnsubjectproducer.service.LearnSubjectService;

@Service
public class LearnSubjectServiceImpl implements LearnSubjectService {
	
	@Autowired
	KafkaTemplate<String, Subject> kafkaTemplate;

	@Override
	public void sendLearnSubjectData(Subject subject) {
		
		kafkaTemplate.send("learn-subject", subject);

	}

}
