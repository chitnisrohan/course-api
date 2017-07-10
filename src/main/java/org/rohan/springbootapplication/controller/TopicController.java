package org.rohan.springbootapplication.controller;

import java.util.Arrays;
import java.util.List;



import org.rohan.domain.Topic;
import org.rohan.springbootapplication.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
//	marks dependency injection
	@Autowired
	private TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();	
	}
	
	@RequestMapping("/topics/{Id}")
	public Topic getTopic(@PathVariable("Id") String topicId) {
		return topicService.getTopic(topicId);
	}
	
//	convert json object in the body of POST request to Topic instance and pass it to the method
	@RequestMapping(value="/topics", method=org.springframework.web.bind.annotation.RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
    }
	
}
