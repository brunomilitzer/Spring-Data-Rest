package com.brunomilitzer.eventmanagement.entities;

import javax.persistence.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
public class Event extends AbstractEntity {

    private static final long serialVersionUID = -5550712730873347005L;

    private String name;
    private String description;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private ZoneId zoneId;
    private Boolean started;

    @ManyToOne( fetch = FetchType.EAGER )
    @JoinColumn( nullable = false )
    private Organizer organizer;

    @OneToMany( mappedBy = "event", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true )
    private Set<Participant> participants;

    @ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL )
    private Venue venue;

    public String getName() {

        return this.name;
    }

    public void setName( final String name ) {

        this.name = name;
    }

    public String getDescription() {

        return this.description;
    }

    public void setDescription( final String description ) {

        this.description = description;
    }

    public ZonedDateTime getStartTime() {

        return this.startTime;
    }

    public void setStartTime( final ZonedDateTime startTime ) {

        this.startTime = startTime;
    }

    public ZonedDateTime getEndTime() {

        return this.endTime;
    }

    public void setEndTime( final ZonedDateTime endTime ) {

        this.endTime = endTime;
    }

    public ZoneId getZoneId() {

        return this.zoneId;
    }

    public void setZoneId( final ZoneId zoneId ) {

        this.zoneId = zoneId;
    }

    public Boolean getStarted() {

        return this.started;
    }

    public void setStarted( final Boolean started ) {

        this.started = started;
    }

    public Organizer getOrganizer() {

        return this.organizer;
    }

    public void setOrganizer( final Organizer organizer ) {

        this.organizer = organizer;
    }

    public Set<Participant> getParticipants() {

        return this.participants;
    }

    public void setParticipants( final Set<Participant> participants ) {

        this.participants = participants;
    }

    public Venue getVenue() {

        return this.venue;
    }

    public void setVenue( final Venue venue ) {

        this.venue = venue;
    }

    @Override
    public boolean equals( final Object obj ) {

        return Objects.equals( this.id, ( ( Event ) obj ).id );
    }

    @Override
    public int hashCode() {

        return Objects.hash( this.id );
    }

}
