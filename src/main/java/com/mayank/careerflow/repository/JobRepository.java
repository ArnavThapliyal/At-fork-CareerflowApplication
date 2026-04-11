package com.mayank.careerflow.repository;

import com.mayank.careerflow.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    // findAll, findById, save, deleteById — sab free mein milta hai!
}
