package com.example.jobportal.employer.service;

import com.example.jobportal.employer.repository.Employer;
import com.example.jobportal.employer.repository.EmployerRepository;
import com.example.jobportal.joblisting.repository.JobListing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployerService {

    @Autowired
    private EmployerRepository employerRepository;

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
//        Employer employerIdToUpdate = employerMap.get(id);
//        employerIdToUpdate.setPhoneNumber(employer.getPhoneNumber());
//        employerIdToUpdate.setCompanyName(employer.getCompanyName());
//        employerIdToUpdate.setEmailAddress(employer.getEmailAddress());
//        employerIdToUpdate.setAddressLine1(employer.getAddressLine1());
//        employerIdToUpdate.setAddressLine2(employer.getAddressLine2());
//        employerIdToUpdate.setCountry(employer.getCountry());
//        employerIdToUpdate.setState(employer.getState());
//        employerIdToUpdate.setCity(employer.getCity());

        return employerRepository.save(employer);
    }

    public void deleteEmployer(Long id) {
        employerRepository.deleteById(id);
    }

}
