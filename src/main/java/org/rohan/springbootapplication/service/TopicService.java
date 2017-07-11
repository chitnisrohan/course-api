package org.rohan.springbootapplication.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.rohan.springbootapplication.domain.Topic;
import org.rohan.springbootapplication.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
//	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
//			new Topic("CS5800", "Algorithms", "Design and Analysis of Algorithms"),
//			new Topic("CS5010", "PDP", "Programming Design Paradigm"),
//			new Topic("CS5600", "Web Development", "MEAN Stack Web Development"),
//			new Topic("CS6400", "MapReduce", "Parallel Data Processing")
//			));
	
	public List<Topic> getAllTopics() {
//		return topics;
//		findAll() does - get all rows from DB, then convert them to Topic instances.
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}

	public Topic getTopic(String topicId) {
//		return topics.stream().filter(t -> t.getId().equals(topicId)).findFirst().get();
		return topicRepository.findOne(topicId);
	}

	public void addTopic(Topic topic) {
//		topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(String topicId, Topic topic) {
//		for(int i = 0 ; i < topics.size() ; i++) {
//			Topic t = topics.get(i);
//			if (t.getId().equals(topicId)){
//				topics.set(i, topic);
//				return;
//			}
//		}
		
//		save method does both create and update as necessary
		topicRepository.save(topic);
	}

	public void deleteTopic(String topicId) {
//		topics.remove(topics.stream().filter(t -> t.getId().equals(topicId)).findFirst().get());
		
		topicRepository.delete(topicId);
	}


}
