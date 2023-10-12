package com.example.jobportal.employer.service;

import com.example.jobportal.employer.AddJobListing;
import com.example.jobportal.employer.repository.Employer;
import com.example.jobportal.employer.repository.EmployerRepository;
import com.example.jobportal.joblisting.repository.JobListing;
import com.example.jobportal.joblisting.repository.JobListingRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployerService {

    private final EmployerRepository employerRepository;
    private final JobListingRepository jobListingRepository;

    public EmployerService(EmployerRepository employerRepository, JobListingRepository jobListingRepository) {
        this.employerRepository = employerRepository;
        this.jobListingRepository = jobListingRepository;
    }

    public Employer getEmployer(Long employerId) {

        Optional<Employer> employerOptional = employerRepository.findById(employerId);
        if (employerOptional.isEmpty()) {
            throw new RuntimeException("Employer does not exist");
        }

        return employerRepository.findById(employerId).get();
    }

    public Employer createEmployer(Employer employer) {

        return employerRepository.save(employer);

    }

    public List<Employer> saveAllEmployers(List<Employer> employers) {
        return employerRepository.saveAll(employers);
    }

    public Employer updateEmployer(Employer employer) {

        Optional<Employer> employerIdToUpdate = employerRepository.findById(employer.getId());
        if (employerIdToUpdate.isEmpty()) {
            throw new RuntimeException("Employer id does not exist");
        }

        return employerRepository.save(employer);
    }

    public void deleteEmployer(Long id) {
        employerRepository.deleteById(id);
    }

    public void addJobListing(AddJobListing addJobListing) {
        Optional<JobListing> jobListingOptional = jobListingRepository.findById(addJobListing.getJobListingId());
        if (jobListingOptional.isEmpty()){
            throw new RuntimeException("Job Listing does not exist");
        }
        Optional<Employer> employerOptional = employerRepository.findById(addJobListing.getEmployerId());
        if (employerOptional.isEmpty()){
            throw new RuntimeException("Employer does not exist");
        }

        JobListing jobListing = jobListingOptional.get();
        Employer employer = employerOptional.get();
        employer.getJobListings().add(jobListing);
        employerRepository.save(employer);
    }

}
