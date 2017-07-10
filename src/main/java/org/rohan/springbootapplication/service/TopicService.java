package org.rohan.springbootapplication.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.rohan.domain.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("CS5800", "Algorithms", "Design and Analysis of Algorithms"),
			new Topic("CS5010", "PDP", "Programming Design Paradigm"),
			new Topic("CS5600", "Web Development", "MEAN Stack Web Development"),
			new Topic("CS6400", "MapReduce", "Parallel Data Processing")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String topicId) {
		return topics.stream().filter(t -> t.getId().equals(topicId)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

}
