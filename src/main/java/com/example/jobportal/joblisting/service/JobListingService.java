package com.example.jobportal.joblisting.service;

import com.example.jobportal.joblisting.repository.JobListing;
import com.example.jobportal.joblisting.repository.JobListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JobListingService {
    @Autowired
    private JobListingRepository jobListingRepository;

    public JobListing getJobListing(Long jobListingId) {

        Optional<JobListing> jobListingOptional = jobListingRepository.findById(jobListingId);

        if (jobListingOptional.isEmpty()) {
            throw new RuntimeException("Job Listing does not exist");
        }
        return jobListingRepository.findById(jobListingId).get();
    }

    public JobListing createJobListing(JobListing jobListing) {

        return jobListingRepository.save(jobListing);
    }

    public List<JobListing> saveAllJobListing(List<JobListing> jobListings) {
        return jobListingRepository.saveAll(jobListings);
    }

    public JobListing updateJobListing(JobListing jobListing) {
        Optional<JobListing> jobListingIdToUpdate = jobListingRepository.findById(jobListing.getId());
        if (jobListingIdToUpdate.isEmpty()) {
            throw new RuntimeException("Job Listing id does not exist.");
        }
//        JobListing jobListingIdToUpdate = jobListingMap.get(id);
//        jobListingIdToUpdate.setTitle(jobListingIdToUpdate.getTitle());
//        jobListing.setListingDate(jobListing.getListingDate());
//        jobListing.setEndDate(jobListingIdToUpdate.getEndDate());
//        jobListing.setEmployer(jobListing.getEmployer());
//        jobListing.setDescription(jobListingIdToUpdate.getDescription());
//
//        jobListingMap.put(id, jobListingIdToUpdate);

        return jobListingRepository.save(jobListing);
    }

    public void deleteJobListing(Long id) {
        jobListingRepository.deleteById(id);
    }

}
