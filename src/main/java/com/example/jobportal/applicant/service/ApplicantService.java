package com.example.jobportal.applicant.service;

import com.example.jobportal.applicant.repository.Applicant;
import com.example.jobportal.applicant.repository.ApplicantRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ApplicantService {

    private ApplicantRepository applicantRepository;
    public Applicant getApplicant(Long applicantId) {
        return applicantRepository.findById(applicantId).get();
    }

    public Applicant createApplicant(Applicant applicant) {

       return applicantRepository.save(applicant);

    }

    public Applicant updateApplicant(Applicant applicant) {

        Optional<Applicant> applicantIdToUpdate = applicantRepository.findById(applicant.getId());

        if (applicantIdToUpdate.isEmpty()) {
            throw new RuntimeException("Applicant id does not exist.");
        }

        return applicantRepository.save(updateApplicant(applicant));

    }

    public void deleteApplicant(Long id) {
        applicantRepository.deleteById(id);
    }

}
