package com.exam2021.kommunevalgbackend.repository;

import com.exam2021.kommunevalgbackend.model.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends JpaRepository<Party, Long> {
}
