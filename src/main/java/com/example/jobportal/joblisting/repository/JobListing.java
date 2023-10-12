package com.example.jobportal.joblisting.repository;

import com.example.jobportal.applicant.repository.Applicant;
import com.example.jobportal.employer.repository.Employer;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class JobListing {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private Date listingDate;
    private Date endDate;
    @ManyToOne
    private Employer employer;
    @ManyToMany
    @JoinColumn(name = "job_listing_id")
    private Set<Applicant> applicants;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getListingDate() {
        return listingDate;
    }

    public void setListingDate(Date listingDate) {
        this.listingDate = listingDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Set<Applicant> getApplicants() {
        return applicants;
    }

    public void setApplicants(Set<Applicant> applicants) {
        this.applicants = applicants;
    }
}
