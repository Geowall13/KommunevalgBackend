package com.exam2021.kommunevalgbackend.model;

import com.exam2021.kommunevalgbackend.repository.PartyRepository;

public class CandidateDTO {

    private long id;

    private String firstName;

    private String middleName;

    private String surName;

    private long partyId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public long getPartyId() {
        return partyId;
    }

    public void setPartyId(long partyId) {
        this.partyId = partyId;
    }


    public Candidate convertToCandidate(PartyRepository partyRepository){
        Candidate candidate = new Candidate();
        candidate.setFirstName(firstName);
        candidate.setMiddleName(middleName);
        candidate.setSurName(surName);

        candidate.setId(id);
        Party party = partyRepository.findById(partyId).get();
        candidate.setParty(party);
        return candidate;
    }
}
