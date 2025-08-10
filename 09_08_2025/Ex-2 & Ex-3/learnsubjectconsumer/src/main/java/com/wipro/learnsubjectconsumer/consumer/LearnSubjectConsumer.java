package com.wipro.learnsubjectconsumer.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.wipro.learnsubjectconsumer.model.Subject;

@Component
public class LearnSubjectConsumer {
	
	@KafkaListener(topics = "learn-subject", groupId = "group_id")
    public void consume(Subject subject) {
        System.out.println("Consumed message: " + subject);
    }

}
