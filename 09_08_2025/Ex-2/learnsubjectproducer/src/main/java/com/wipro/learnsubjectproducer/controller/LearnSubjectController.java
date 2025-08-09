package com.wipro.learnsubjectproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.learnsubjectproducer.service.LearnSubjectService;

@RestController
@RequestMapping("/learn")
public class LearnSubjectController {

	
	@Autowired
	LearnSubjectService learnSubjectService;
	
	@PostMapping
	public void sendLearnSubjectData(@RequestParam String subjectCode, @RequestParam String subject) {
		learnSubjectService.sendLearnSubjectData(subjectCode, subject);
	}
}
