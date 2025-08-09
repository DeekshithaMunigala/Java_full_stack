package com.wipro.learnsubjectconsumer.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class LearnSubjectConsumer {
	
	@KafkaListener(topics = "learn-subject", groupId = "group_id")
    public void consume(String msg) {
        System.out.println("Consumed message: " + msg);
    }

}
