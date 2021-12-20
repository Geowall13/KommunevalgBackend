package com.exam2021.kommunevalgbackend.controller;


import com.exam2021.kommunevalgbackend.model.Candidate;
import com.exam2021.kommunevalgbackend.model.Party;
import com.exam2021.kommunevalgbackend.repository.CandidateRepository;
import com.exam2021.kommunevalgbackend.repository.PartyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CandidateController {

    CandidateRepository candidateRepository;

    PartyRepository partyRepository;

    public CandidateController(CandidateRepository candidateRepository, PartyRepository partyRepository){
        this.candidateRepository = candidateRepository;
        this.partyRepository = partyRepository;
    }

    @GetMapping("/candidate/{id}")
    public ResponseEntity<Candidate> getCandidateFromId(@PathVariable long id){
        Candidate candidate = candidateRepository.findById(id).get();
        return new ResponseEntity<>(candidate, HttpStatus.OK);
    }

    @GetMapping("/candidates")
    public ResponseEntity<List<Candidate>> getAllCandidates(){
        List<Candidate> candidates = candidateRepository.findAll();
        return new ResponseEntity<>(candidates, HttpStatus.OK);
    }

    @PostMapping(value = "/candidate/{id}", consumes = "application/json")
    public ResponseEntity<Candidate> createCandidate(@RequestBody Candidate candidate, @PathVariable long id){
        Party party = partyRepository.findById(id).get();
        candidate.setParty(party);
        candidateRepository.save(candidate);
        return new ResponseEntity<>(candidate, HttpStatus.CREATED);
    }

    @PutMapping(value = "/candidate/{id}", consumes = "application/json")
    public ResponseEntity<Candidate> updateCandidate(@RequestBody Candidate candidate, @PathVariable long id){
        Party party = partyRepository.findById(id).get();
        candidate.setParty(party);
        candidateRepository.save(candidate);
        return new ResponseEntity<>(candidate, HttpStatus.CREATED);
    }

    @DeleteMapping("/candidate/{id}")
    public ResponseEntity<Long> deleteCandidate(@PathVariable long id){
        candidateRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
