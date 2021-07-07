package com.brunomilitzer.eventmanagement.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;

@Entity
public class Organizer extends AbstractEntity {

    private static final long serialVersionUID = -1370461838189226690L;

    private String name;

    @OneToMany( mappedBy = "organizer" )
    private Set<Event> events;

    public String getName() {

        return this.name;
    }

    public void setName( final String name ) {

        this.name = name;
    }

    public Set<Event> getEvents() {

        return this.events;
    }

    public void setEvents( final Set<Event> events ) {

        this.events = events;
    }

    @Override
    public boolean equals( final Object obj ) {

        return Objects.equals( this.id, ( ( Organizer ) obj ).id );
    }

    @Override
    public int hashCode() {

        return Objects.hash( this.id );
    }

}
