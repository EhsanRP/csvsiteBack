package com.example.demo.repositories;

import com.example.demo.domain.Experties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpertiesRepository extends JpaRepository<Experties,Integer> {
}
