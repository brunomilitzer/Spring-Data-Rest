package com.brunomilitzer.eventmanagement.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Participant extends AbstractEntity {

    private static final long serialVersionUID = -4046642783134648908L;

    @Column( nullable = false )
    private String name;

    @Column( nullable = false )
    private String email;

    private Boolean checkedIn;

    @ManyToOne( fetch = FetchType.EAGER )
    @JoinColumn( referencedColumnName = "ID", nullable = false, updatable = false )
    private Event event;

    public String getName() {

        return this.name;
    }

    public void setName( final String name ) {

        this.name = name;
    }

    public String getEmail() {

        return this.email;
    }

    public void setEmail( final String email ) {

        this.email = email;
    }

    public Boolean getCheckedIn() {

        return this.checkedIn;
    }

    public void setCheckedIn( final Boolean checkedIn ) {

        this.checkedIn = checkedIn;
    }

    public Event getEvent() {

        return this.event;
    }

    public void setEvent( final Event event ) {

        this.event = event;
    }

    @Override
    public boolean equals( final Object obj ) {

        return Objects.equals( this.id, ( ( Participant ) obj ).id );
    }

    @Override
    public int hashCode() {

        return Objects.hash( this.id );
    }

}
