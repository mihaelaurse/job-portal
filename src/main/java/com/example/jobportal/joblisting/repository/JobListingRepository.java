package com.example.jobportal.joblisting.repository;

import com.example.jobportal.joblisting.controller.JobListing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobListingRepository extends CrudRepository<JobListing, Long> {
}
