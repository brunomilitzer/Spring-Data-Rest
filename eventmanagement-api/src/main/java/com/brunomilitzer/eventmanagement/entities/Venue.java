package com.brunomilitzer.eventmanagement.entities;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
@JsonPropertyOrder( { "resourceId" } )
public class Venue extends AbstractEntity {

    private static final long serialVersionUID = 2762249379844290211L;

    private String name;
    private String streetAddress;
    private String streetAddress2;
    private String city;
    private String state;
    private String country;
    private String postalCode;

    public String getName() {

        return this.name;
    }

    public void setName( final String name ) {

        this.name = name;
    }

    public String getStreetAddress() {

        return this.streetAddress;
    }

    public void setStreetAddress( final String streetAddress ) {

        this.streetAddress = streetAddress;
    }

    public String getStreetAddress2() {

        return this.streetAddress2;
    }

    public void setStreetAddress2( final String streetAddress2 ) {

        this.streetAddress2 = streetAddress2;
    }

    public String getCity() {

        return this.city;
    }

    public void setCity( final String city ) {

        this.city = city;
    }

    public String getState() {

        return this.state;
    }

    public void setState( final String state ) {

        this.state = state;
    }

    public String getCountry() {

        return this.country;
    }

    public void setCountry( final String country ) {

        this.country = country;
    }

    public String getPostalCode() {

        return this.postalCode;
    }

    public void setPostalCode( final String postalCode ) {

        this.postalCode = postalCode;
    }

    public Long getResourceId() {

        return this.id;
    }

    @Override
    public boolean equals( final Object obj ) {

        return Objects.equals( this.id, ( ( Venue ) obj ).id );
    }

    @Override
    public int hashCode() {

        return Objects.hash( this.id );
    }

}
