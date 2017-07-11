package org.rohan.springbootapplication.repository;

import org.rohan.springbootapplication.domain.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

	
}
