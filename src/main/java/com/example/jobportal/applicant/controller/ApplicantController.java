package com.example.jobportal.applicant.controller;

import com.example.jobportal.applicant.repository.Applicant;
import com.example.jobportal.applicant.service.ApplicantService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("com/example/jobportal/applicant")
public class ApplicantController {
    private final ApplicantService applicantService;

    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping("/{id}")
    private Applicant getApplicant(@PathVariable("id") Long applicantId) {
        return applicantService.getApplicant(applicantId);
    }

    @GetMapping
    private Set<Applicant> getApplicant() {
        return applicantService.getApplicant();
    }

    @PostMapping
    private Applicant createApplicant(@RequestBody Applicant applicant) {
        return applicantService.createApplicant(applicant);
    }

    @PutMapping
    private Applicant updateApplicant(@RequestBody Applicant applicant) {
        return applicantService.updateApplicant(applicant);
    }

    @DeleteMapping("/{id}")
    private void deleteApplicant(@PathVariable("id") Long applicantId) {
        applicantService.deleteApplicant(applicantId);
    }
}
