package com.example.jobportal.joblisting.service;

import com.example.jobportal.applicant.repository.Applicant;
import com.example.jobportal.applicant.repository.ApplicantRepository;
import com.example.jobportal.joblisting.ApplyForJob;
import com.example.jobportal.joblisting.repository.JobListing;
import com.example.jobportal.joblisting.repository.JobListingRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JobListingService {

    private final JobListingRepository jobListingRepository;
    private final ApplicantRepository applicantRepository;

    public JobListingService(JobListingRepository jobListingRepository, ApplicantRepository applicantRepository) {
        this.jobListingRepository = jobListingRepository;
        this.applicantRepository = applicantRepository;
    }

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

        return jobListingRepository.save(jobListing);
    }

    public void deleteJobListing(Long id) {
        jobListingRepository.deleteById(id);
    }

    public void applyForJob(ApplyForJob applyForJob) {
        Optional<JobListing> jobListingOptional = jobListingRepository.findById(applyForJob.getJobListingId());
        if (jobListingOptional.isEmpty()){
            throw new RuntimeException("Job Listing does not exist");
        }

        Optional<Applicant> applicantOptional = applicantRepository.findById(applyForJob.getApplicantId());
        if (applicantOptional.isEmpty()) {
            throw new RuntimeException("Applicant does not exist");
        }

        JobListing jobListing = jobListingOptional.get();
        Applicant applicant = applicantOptional.get();
        jobListing.getApplicants().add(applicant);
        jobListingRepository.save(jobListing);
    }

}
