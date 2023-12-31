package com.example.jobportal.applicant.service;

import com.example.jobportal.applicant.repository.Applicant;
import com.example.jobportal.applicant.repository.ApplicantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicantService {

    private final ApplicantRepository applicantRepository;

    public ApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    public Applicant getApplicant(Long applicantId) {

        Optional<Applicant> applicantOptional = applicantRepository.findById(applicantId);
        if (applicantOptional.isEmpty()) {
            throw new RuntimeException("Applicant does not exist");
        }

        return applicantOptional.get();
    }

    public List<Applicant> getAllApplicants() {
        return applicantRepository.findAll();
    }

    public Applicant createApplicant(Applicant applicant) {

        return applicantRepository.save(applicant);

    }

    public List<Applicant> saveAllApplicants(List<Applicant> applicants) {
        return applicantRepository.saveAll(applicants);
    }

    public Applicant updateApplicant(Applicant applicant) {

        Optional<Applicant> applicantIdToUpdate = applicantRepository.findById(applicant.getId());

        if (applicantIdToUpdate.isEmpty()) {
            throw new RuntimeException("Applicant id does not exist");
        }

        return applicantRepository.save(applicant);

    }

    public void deleteApplicant(Long id) {
        applicantRepository.deleteById(id);
    }

}
