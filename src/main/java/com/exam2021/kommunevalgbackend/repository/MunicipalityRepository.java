package com.exam2021.kommunevalgbackend.repository;

import com.exam2021.kommunevalgbackend.model.Municipality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicipalityRepository extends JpaRepository<Municipality, Long> {
}
