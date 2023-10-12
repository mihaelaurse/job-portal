package com.example.jobportal.joblisting.controller;

import com.example.jobportal.joblisting.ApplyForJob;
import com.example.jobportal.joblisting.repository.JobListing;
import com.example.jobportal.joblisting.service.JobListingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/job-listing")
public class JobListingController {

    private final JobListingService jobListingService;

    public JobListingController(JobListingService jobListingService) {
        this.jobListingService = jobListingService;
    }

    @GetMapping("/{id}")
    private JobListing getJobListing(@PathVariable("id") Long jobListingId) {
        return jobListingService.getJobListing(jobListingId);
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

    @PostMapping("/apply-for-job")
    public void applyForJob(@RequestBody ApplyForJob applyForJob) {
        jobListingService.applyForJob(applyForJob);
    }
}
