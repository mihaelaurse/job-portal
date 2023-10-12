package com.example.jobportal.employer.service;

import com.example.jobportal.employer.controller.Employer;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployerService {


    public Employer getEmployer(Long employerId) {
        return employerMap.get(employerId);
    }

    public Employer createEmployer(Employer employer) {
        Random random = new Random();
        Long key = random.nextLong();
        employer.setId(key);
        employerMap.put(key, employer);

        return employerMap.get(key);
    }

    public Employer updateEmployer(Employer employer) {
        Long id = employer.getId();
        if (!employerMap.containsKey(id)) {
            throw new RuntimeException("Employer id does not exist.");
        }
        Employer employerIdToUpdate = employerMap.get(id);
        employerIdToUpdate.setPhoneNumber(employer.getPhoneNumber());
        employerIdToUpdate.setCompanyName(employer.getCompanyName());
        employerIdToUpdate.setEmailAddress(employer.getEmailAddress());
        employerIdToUpdate.setAddressLine1(employer.getAddressLine1());
        employerIdToUpdate.setAddressLine2(employer.getAddressLine2());
        employerIdToUpdate.setCountry(employer.getCountry());
        employerIdToUpdate.setState(employer.getState());
        employerIdToUpdate.setCity(employer.getCity());

        employerMap.put(id, employerIdToUpdate);

        return employerIdToUpdate;
    }

    public void deleteEmployer(Long id) {
        employerMap.remove(id);
    }

    public Set<Employer> getEmployer() {
        return new HashSet<>(employerMap.values());
    }

}
