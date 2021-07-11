package com.brunomilitzer.eventmanagement.controllers;

import com.brunomilitzer.eventmanagement.controllers.exceptions.AlreadyCheckedInException;
import com.brunomilitzer.eventmanagement.entities.Participant;
import com.brunomilitzer.eventmanagement.repositories.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping( "/events" )
public class CheckInController {

    @Autowired
    private ParticipantRepository participantRepository;

    @PostMapping( "/checkin/{id}" )
    public ResponseEntity<PersistentEntityResource> checkIn( @PathVariable( "id" ) final Long id, final PersistentEntityResourceAssembler assembler ) {

        Participant participant = null;

        if ( this.participantRepository.findById( id ).isPresent() ) {
            participant = this.participantRepository.findById( id ).get();

            if ( participant.getCheckedIn() ) {
                throw new AlreadyCheckedInException();
            }

            participant.setCheckedIn( true );
            this.participantRepository.save( participant );
        }

        return ResponseEntity.ok( assembler.toFullResource( participant ) );
    }

}
