package com.brunomilitzer.eventmanagement.repositories;

import com.brunomilitzer.eventmanagement.entities.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}
