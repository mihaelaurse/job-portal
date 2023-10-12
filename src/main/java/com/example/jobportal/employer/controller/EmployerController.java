package com.example.jobportal.employer.controller;

import com.example.jobportal.employer.repository.Employer;
import com.example.jobportal.employer.service.EmployerService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/employer")
public class EmployerController {

    private final EmployerService employerService;

    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("/id")
    private Employer getEmployer(@PathVariable("id") Long employerId) {
        return employerService.getEmployer(employerId);
    }

//    @GetMapping
//    private Set<Employer> getEmployer() {
//        return employerService.getEmployer();
//    }

    @PostMapping
    private Employer createEmployer(@RequestBody Employer employer) {
        return employerService.createEmployer(employer);
    }

    @PutMapping
    private Employer updateEmployer(@RequestBody Employer employer) {
        return employerService.updateEmployer(employer);
    }

    @DeleteMapping("/id")
    private void deleteEmployer(@PathVariable("id") Long employerId) {
        employerService.deleteEmployer(employerId);
    }
}
