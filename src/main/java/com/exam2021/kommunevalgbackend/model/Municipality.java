package com.exam2021.kommunevalgbackend.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Municipality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "municipality", cascade = CascadeType.ALL)
    private List<Party> parties;

    @Column
    private int eligibleVoters;

    @Column
    private int blankVotes;

    @Column
    private int totalVotes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Party> getParties() {
        return parties;
    }

    public void setParties(List<Party> parties) {
        this.parties = parties;
    }

    public int getEligibleVoters() {
        return eligibleVoters;
    }

    public void setEligibleVoters(int eligibleVoters) {
        this.eligibleVoters = eligibleVoters;
    }

    public int getBlankVotes() {
        return blankVotes;
    }

    public void setBlankVotes(int blankVotes) {
        this.blankVotes = blankVotes;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }
}
