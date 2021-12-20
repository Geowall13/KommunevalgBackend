package com.exam2021.kommunevalgbackend.controller;


import com.exam2021.kommunevalgbackend.model.Candidate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class CandidateController {

    @GetMapping("/candidate/{id}")
    public ResponseEntity<Candidate> getCandidateFromId(@PathVariable int id){

        Candidate candidate = new Candidate();
        candidate.setId(1);
        return new ResponseEntity<>(candidate, HttpStatus.OK);
    }
}
