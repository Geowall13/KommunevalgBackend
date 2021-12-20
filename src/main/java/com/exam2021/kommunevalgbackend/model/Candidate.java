package com.exam2021.kommunevalgbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "Candidate")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
