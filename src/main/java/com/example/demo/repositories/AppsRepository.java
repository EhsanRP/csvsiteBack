package com.example.demo.repositories;

import com.example.demo.domain.Apps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppsRepository extends JpaRepository<Apps,Integer> {
}
