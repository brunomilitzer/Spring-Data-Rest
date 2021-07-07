package com.brunomilitzer.eventmanagement.repositories;

import com.brunomilitzer.eventmanagement.entities.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}
