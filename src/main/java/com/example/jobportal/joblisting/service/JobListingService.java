package com.example.jobportal.joblisting.service;

import com.example.jobportal.joblisting.controller.JobListing;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JobListingService {
    Map<Integer, JobListing> jobListingMap = new HashMap<>();

    public JobListing getJobListing(Long jobListingId) {
        return jobListingMap.get(jobListingId);
    }

    public JobListing createJobListing(JobListing jobListing) {
        Random random = new Random();
        Long key = random.nextInt();
        jobListing.setId(key);
        jobListingMap.put(key, jobListing);

        return jobListingMap.get(key);
    }

    public JobListing updateJobListing(JobListing jobListing) {
        Long id = jobListing.getId();
        if (!jobListingMap.containsKey(id)) {
            throw new RuntimeException("Job Listing id does not exist.");
        }
        JobListing jobListingIdToUpdate = jobListingMap.get(id);
        jobListingIdToUpdate.setTitle(jobListingIdToUpdate.getTitle());
        jobListing.setListingDate(jobListing.getListingDate());
        jobListing.setEndDate(jobListingIdToUpdate.getEndDate());
        jobListing.setEmployer(jobListing.getEmployer());
        jobListing.setDescription(jobListingIdToUpdate.getDescription());

        jobListingMap.put(id, jobListingIdToUpdate);

        return jobListingIdToUpdate;
    }

    public void deleteJobListing(Long id) {
        jobListingMap.remove(id);
    }

    public Set<JobListing> getJobListing() {
        return new HashSet<>(jobListingMap.values());
    }

}
