package com.example.jobportal.joblisting.repository;

import com.example.jobportal.joblisting.controller.JobListing;
import com.example.jobportal.joblisting.service.JobListingService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("jobListing")
public class JobListingController {

    private final JobListingService jobListingService;

    public JobListingController(JobListingService jobListingService) {
        this.jobListingService = jobListingService;
    }

    @GetMapping("/{id}")
    private JobListing getJobListing(@PathVariable("id") Long jobListingId) {
        return jobListingService.getJobListing(jobListingId);
    }

    @GetMapping
    private Set<JobListing> getJobListing() {
        return jobListingService.getJobListing();
    }

    @PostMapping
    private JobListing createJobListing(@RequestBody JobListing jobListing) {
        return jobListingService.createJobListing(jobListing);
    }

    @PutMapping
    private JobListing updateJobListing(@RequestBody JobListing jobListing) {
        return jobListingService.updateJobListing(jobListing);
    }

    @DeleteMapping("/{id}")
    private void deleteJobListing(@PathVariable("id") Long jobListingId) {
        jobListingService.deleteJobListing(jobListingId);
    }
}
