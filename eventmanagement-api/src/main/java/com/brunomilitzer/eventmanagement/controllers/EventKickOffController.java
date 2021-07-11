package com.brunomilitzer.eventmanagement.controllers;

import com.brunomilitzer.eventmanagement.entities.Event;
import com.brunomilitzer.eventmanagement.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping( "/events" )
public class EventKickOffController {

    @Autowired
    private EventRepository eventRepository;

    @PostMapping( "/start/{id}" )
    public ResponseEntity<String> start( @PathVariable( "id" ) final Long id ) {

        final Event event = this.eventRepository.findById( id ).orElseThrow( ResourceNotFoundException::new );

        event.setStarted( true );

        this.eventRepository.save( event );

        return ResponseEntity.ok( event.getName() + " has started" );
    }

}
