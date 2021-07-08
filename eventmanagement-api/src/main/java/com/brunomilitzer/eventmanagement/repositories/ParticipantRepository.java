package com.brunomilitzer.eventmanagement.repositories;

import com.brunomilitzer.eventmanagement.entities.Participant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}
