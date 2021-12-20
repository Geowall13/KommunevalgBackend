package com.exam2021.kommunevalgbackend.controller;

import com.exam2021.kommunevalgbackend.model.Candidate;
import com.exam2021.kommunevalgbackend.model.Party;
import com.exam2021.kommunevalgbackend.repository.CandidateRepository;
import com.exam2021.kommunevalgbackend.repository.PartyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class PartyController {

    PartyRepository partyRepository;

    CandidateRepository candidateRepository;

    public PartyController(PartyRepository partyRepository, CandidateRepository candidateRepository){
        this.partyRepository = partyRepository;
        this.candidateRepository = candidateRepository;
    }


    @GetMapping("/party/{id}/candidates/")
    public ResponseEntity<List<Candidate>> getPartyCandidates(@PathVariable long id){

        List<Candidate> allCandidates = candidateRepository.findAll();
        List<Candidate> returnList = new ArrayList<>();
        for(Candidate candidate : allCandidates){
            if(candidate.getParty().getId() == id){
                returnList.add(candidate);
            }
        }
        return new ResponseEntity<>(returnList, HttpStatus.OK);
    }

    @GetMapping("/parties")
    public ResponseEntity<List<Party>> getParties(){
        List<Party> parties = partyRepository.findAll();
        return new ResponseEntity<>(parties, HttpStatus.OK);
    }


}
