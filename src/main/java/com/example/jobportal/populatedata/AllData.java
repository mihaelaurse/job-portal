package com.example.jobportal.populatedata;

import com.example.jobportal.applicant.repository.Applicant;
import com.example.jobportal.employer.repository.Employer;
import com.example.jobportal.joblisting.repository.JobListing;

import java.util.List;

public class AllData {

    private List<Applicant> applicantList;
    private List<Employer> employerList;
    private List<JobListing> jobListingList;

    public List<Applicant> getApplicantList() {
        return applicantList;
    }

    public void setApplicantList(List<Applicant> applicantList) {
        this.applicantList = applicantList;
    }

    public List<Employer> getEmployerList() {
        return employerList;
    }

    public void setEmployerList(List<Employer> employerList) {
        this.employerList = employerList;
    }

    public List<JobListing> getJobListingList() {
        return jobListingList;
    }

    public void setJobListingList(List<JobListing> jobListingList) {
        this.jobListingList = jobListingList;
    }
}
