package com.exam2021.kommunevalgbackend.controller;


import com.exam2021.kommunevalgbackend.model.Candidate;
import com.exam2021.kommunevalgbackend.model.CandidateDTO;
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

    @PostMapping(value = "/candidate", consumes = "application/json")
    public ResponseEntity<Candidate> createCandidate(@RequestBody CandidateDTO candidateDTO){
        Candidate candidate = candidateDTO.convertToCandidate(partyRepository);
        candidateRepository.save(candidate);
        return new ResponseEntity<>(candidate, HttpStatus.CREATED);
    }

    @PutMapping(value = "/candidate", consumes = "application/json")
    public ResponseEntity<Candidate> updateCandidate(@RequestBody CandidateDTO candidateDTO){
        Candidate candidate = candidateDTO.convertToCandidate(partyRepository);
        candidateRepository.save(candidate);
        return new ResponseEntity<>(candidate, HttpStatus.CREATED);
    }

    @DeleteMapping("/candidate/{id}")
    public ResponseEntity<Long> deleteCandidate(@PathVariable long id){
        candidateRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
