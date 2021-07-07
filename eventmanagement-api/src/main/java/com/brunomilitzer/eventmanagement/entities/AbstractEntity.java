package com.brunomilitzer.eventmanagement.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

    private static final long serialVersionUID = 5817860607187133167L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( nullable = false, updatable = false )
    protected Long id;

    @CreationTimestamp
    @Column( updatable = false )
    protected Instant created;

    public Long getId() {

        return this.id;
    }

    public void setId( final Long id ) {

        this.id = id;
    }

    public Instant getCreated() {

        return this.created;
    }

    public void setCreated( final Instant created ) {

        this.created = created;
    }

}
