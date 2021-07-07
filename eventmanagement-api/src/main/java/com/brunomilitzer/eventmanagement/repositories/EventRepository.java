package com.brunomilitzer.eventmanagement.repositories;

import com.brunomilitzer.eventmanagement.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {

}
