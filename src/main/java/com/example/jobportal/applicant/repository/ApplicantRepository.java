package com.example.jobportal.applicant.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicantRepository extends CrudRepository<Applicant, Long> {

}
