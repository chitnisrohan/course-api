package org.rohan.springbootapplication.controller;

import java.util.List;

import org.rohan.domain.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return "All Topics";	
	}
}
