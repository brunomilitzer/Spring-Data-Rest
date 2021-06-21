package com.brunomilitzer.springdatarest.employee.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {

    private static final long serialVersionUID = -2637331308573250721L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    public Long getId() {

        return this.id;
    }

    public Long getResourceId() {

        return this.id;
    }

    public void setId(final Long id) {

        this.id = id;
    }

    public String getFirstName() {

        return this.firstName;
    }

    public void setFirstName(final String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return this.lastName;
    }

    public void setLastName(final String lastName) {

        this.lastName = lastName;
    }

}
