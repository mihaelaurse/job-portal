package com.example.jobportal.employer.repository;

import com.example.jobportal.employer.controller.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends CrudRepository<Employer, Long> {
}
