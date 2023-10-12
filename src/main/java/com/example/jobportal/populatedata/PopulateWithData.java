package com.example.jobportal.populatedata;

import com.example.jobportal.applicant.repository.Applicant;
import com.example.jobportal.applicant.service.ApplicantService;
import com.example.jobportal.employer.repository.Employer;
import com.example.jobportal.employer.service.EmployerService;
import com.example.jobportal.joblisting.repository.JobListing;
import com.example.jobportal.joblisting.service.JobListingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/populate")
public class PopulateWithData {
    private final EmployerService employerService;
    private final ApplicantService applicantService;
    private final JobListingService jobListingService;

    public PopulateWithData(EmployerService employerService, ApplicantService applicantService, JobListingService jobListingService) {
        this.employerService = employerService;
        this.applicantService = applicantService;
        this.jobListingService = jobListingService;
    }

    @PostMapping
    public AllData populateData() {
        Employer employer1 = new Employer();
        employer1.setAddressLine1("Nicolina nr.22");
        employer1.setCity("Iasi");
        employer1.setPhoneNumber("0756213245");
        employer1.setEmailAddress("test@gmail.com");
        employer1.setState("Romania");
        employer1.setAddressLine2("Scara A, ap.1");
        employer1.setCompanyName("Test company");

        Employer employer2 = new Employer();
        employer2.setAddressLine1("Codrescu nr.22");
        employer2.setCity("Iasi");
        employer2.setPhoneNumber("0756276898");
        employer2.setEmailAddress("test.company@gmail.com");
        employer2.setState("Romania");
        employer2.setAddressLine2("Copou");
        employer2.setCompanyName("Company Two");

        Applicant applicant1 = new Applicant();
        applicant1.setFirstName("Stefan");
        applicant1.setLastName("Rotaru");
        applicant1.setEmailAddress("stefan@gmail.com");
        applicant1.setAddressLine1("Nicolina");
        applicant1.setAddressLine2("Nr2");
        applicant1.setCountry("Romania");
        applicant1.setCity("Iasi");

        Applicant applicant2 = new Applicant();
        applicant2.setFirstName("Alexandru");
        applicant2.setLastName("Hutanu");
        applicant2.setEmailAddress("alexandru@gmail.com");
        applicant2.setAddressLine1("Str Nicolina");
        applicant2.setAddressLine2("Nr20");
        applicant2.setCountry("Romania");
        applicant2.setCity("Iasi");

        Applicant applicant3 = new Applicant();
        applicant3.setFirstName("Alma");
        applicant3.setLastName("Dobai");
        applicant3.setEmailAddress("alma@gmail.com");
        applicant3.setAddressLine1("Str Libertatii");
        applicant3.setAddressLine2("Nr3");
        applicant3.setCountry("Romania");
        applicant3.setCity("Vaslui");

        Applicant applicant4 = new Applicant();
        applicant4.setFirstName("Teodor");
        applicant4.setLastName("Lupascu");
        applicant4.setEmailAddress("teodor@gmail.com");
        applicant4.setAddressLine1("Str Tineretii");
        applicant4.setAddressLine2("Nr15");
        applicant4.setCountry("Romania");
        applicant4.setCity("Roman");

        Applicant applicant5 = new Applicant();
        applicant5.setFirstName("Anca");
        applicant5.setLastName("Petrovici");
        applicant5.setEmailAddress("anca@gmail.com");
        applicant5.setAddressLine1("Str Macazului");
        applicant5.setAddressLine2("Nr10");
        applicant5.setCountry("Romania");
        applicant5.setCity("Focsani");

        Applicant applicant6 = new Applicant();
        applicant6.setFirstName("Iolanda");
        applicant6.setLastName("Chetreanu");
        applicant6.setEmailAddress("iolanda@gmail.com");
        applicant6.setAddressLine1("Str Anastasie Panu");
        applicant6.setAddressLine2("Nr17");
        applicant6.setCountry("Romania");
        applicant6.setCity("Bucuresti");

        Applicant applicant7 = new Applicant();
        applicant7.setFirstName("Marius");
        applicant7.setLastName("Ursu");
        applicant7.setEmailAddress("marius@gmail.com");
        applicant7.setAddressLine1("Str Egalitatii");
        applicant7.setAddressLine2("Nr13");
        applicant7.setCountry("Romania");
        applicant7.setCity("Galati");

        Applicant applicant8 = new Applicant();
        applicant8.setFirstName("Andrei");
        applicant8.setLastName("Vatmanu");
        applicant8.setEmailAddress("andrei@gmail.com");
        applicant8.setAddressLine1("Str Ipatescu");
        applicant8.setAddressLine2("Nr22");
        applicant8.setCountry("Romania");
        applicant8.setCity("Bacau");

        Applicant applicant9 = new Applicant();
        applicant9.setFirstName("Ovidiu");
        applicant9.setLastName("Ion");
        applicant9.setEmailAddress("ovidiu@gmail.com");
        applicant9.setAddressLine1("Str Oastei");
        applicant9.setAddressLine2("Nr8");
        applicant9.setCountry("Romania");
        applicant9.setCity("Iasi");

        Applicant applicant10 = new Applicant();
        applicant10.setFirstName("Marian");
        applicant10.setLastName("Cracea");
        applicant10.setEmailAddress("marian@gmail.com");
        applicant10.setAddressLine1("Str Revolutiei");
        applicant10.setAddressLine2("Nr4");
        applicant10.setCountry("Romania");
        applicant10.setCity("Brasov");

        Applicant applicant11 = new Applicant();
        applicant11.setFirstName("Stefan");
        applicant11.setLastName("Hutanu");
        applicant11.setEmailAddress("stefan2@gmail.com");
        applicant11.setAddressLine1("Nicolina");
        applicant11.setAddressLine2("Nr20");
        applicant11.setCountry("Romania");
        applicant11.setCity("Iasi");

        Applicant applicant12 = new Applicant();
        applicant12.setFirstName("Alexandru");
        applicant12.setLastName("Cracea");
        applicant12.setEmailAddress("alexandru@gmail.com");
        applicant12.setAddressLine1("Str Nicolina");
        applicant12.setAddressLine2("Nr2");
        applicant12.setCountry("Romania");
        applicant12.setCity("Iasi");

        Applicant applicant13 = new Applicant();
        applicant13.setFirstName("Alma");
        applicant13.setLastName("Lupascu");
        applicant13.setEmailAddress("alma@gmail.com");
        applicant13.setAddressLine1("Str Libertatii");
        applicant13.setAddressLine2("Nr30");
        applicant13.setCountry("Romania");
        applicant13.setCity("Vaslui");

        Applicant applican14 = new Applicant();
        applican14.setFirstName("Teodor");
        applican14.setLastName("Dobai");
        applican14.setEmailAddress("teodor@gmail.com");
        applican14.setAddressLine1("Str Tineretii");
        applican14.setAddressLine2("Nr5");
        applican14.setCountry("Romania");
        applican14.setCity("Roman");

        Applicant applicant15 = new Applicant();
        applicant15.setFirstName("Anca");
        applicant15.setLastName("Chetreanu");
        applicant15.setEmailAddress("anca@gmail.com");
        applicant15.setAddressLine1("Str Macazului");
        applicant15.setAddressLine2("Nr1");
        applicant15.setCountry("Romania");
        applicant15.setCity("Focsani");

        Applicant applicant16 = new Applicant();
        applicant16.setFirstName("Iolanda");
        applicant16.setLastName("Petrovici");
        applicant16.setEmailAddress("iolanda@gmail.com");
        applicant16.setAddressLine1("Str Anastasie Panu");
        applicant16.setAddressLine2("Nr7");
        applicant16.setCountry("Romania");
        applicant16.setCity("Bucuresti");

        Applicant applicant17 = new Applicant();
        applicant17.setFirstName("Marius");
        applicant17.setLastName("Vatmanu");
        applicant17.setEmailAddress("marius@gmail.com");
        applicant17.setAddressLine1("Str Egalitatii");
        applicant17.setAddressLine2("Nr3");
        applicant17.setCountry("Romania");
        applicant17.setCity("Galati");

        Applicant applicant18 = new Applicant();
        applicant18.setFirstName("Andrei");
        applicant18.setLastName("Ursu");
        applicant18.setEmailAddress("andrei@gmail.com");
        applicant18.setAddressLine1("Str Ipatescu");
        applicant18.setAddressLine2("Nr2");
        applicant18.setCountry("Romania");
        applicant18.setCity("Bacau");

        Applicant applicant19 = new Applicant();
        applicant19.setFirstName("Ovidiu");
        applicant19.setLastName("Cracea");
        applicant19.setEmailAddress("ovidiu@gmail.com");
        applicant19.setAddressLine1("Str Oastei");
        applicant19.setAddressLine2("Nr8");
        applicant19.setCountry("Romania");
        applicant19.setCity("Iasi");

        Applicant applicant20 = new Applicant();
        applicant20.setFirstName("Marian");
        applicant20.setLastName("Ion");
        applicant20.setEmailAddress("marian@gmail.com");
        applicant20.setAddressLine1("Str Revolutiei");
        applicant20.setAddressLine2("Nr40");
        applicant20.setCountry("Romania");
        applicant20.setCity("Brasov");

        JobListing jobListing1 = new JobListing();
        jobListing1.setTitle("Middle Java developer");
        jobListing1.setDescription("We are looking for a person with 3 years of experience");
        jobListing1.setListingDate(new Date());
        jobListing1.setEndDate(new Date(2023, 10, 12));
        jobListing1.setEmployer(employer1);
        jobListing1.setApplicants(Set.of(applicant1, applicant2, applicant6));

        JobListing jobListing2 = new JobListing();
        jobListing2.setTitle("Senior Java developer");
        jobListing2.setDescription("We are looking for a person with 6 years of experience");
        jobListing2.setListingDate(new Date());
        jobListing2.setEndDate(new Date(2023, 12, 12));
        jobListing2.setEmployer(employer1);
        jobListing2.setApplicants(Set.of(applicant5, applicant8));

        JobListing jobListing3 = new JobListing();
        jobListing3.setTitle("Junior Java developer");
        jobListing3.setDescription("We are looking for a person with 1 years of experience");
        jobListing3.setListingDate(new Date());
        jobListing3.setEndDate(new Date(2023, 11, 20));
        jobListing3.setEmployer(employer1);
        jobListing3.setApplicants(Set.of(applicant11, applicant12, applicant17));

        JobListing jobListing4 = new JobListing();
        jobListing4.setTitle("Middle C# developer");
        jobListing4.setDescription("We are looking for a person with 3 years of experience");
        jobListing4.setListingDate(new Date());
        jobListing4.setEndDate(new Date(2023, 12, 29));
        jobListing4.setEmployer(employer1);
        jobListing4.setApplicants(Set.of(applicant10, applicant15));

        JobListing jobListing5 = new JobListing();
        jobListing5.setTitle("Junior C# developer");
        jobListing5.setDescription("We are looking for a person with 1 years of experience");
        jobListing5.setListingDate(new Date());
        jobListing5.setEndDate(new Date(2024, 1, 12));
        jobListing5.setEmployer(employer2);
        jobListing5.setApplicants(Set.of(applicant7, applicant9, applicant8, applican14));

        JobListing jobListing6 = new JobListing();
        jobListing6.setTitle("Senior C# developer");
        jobListing6.setDescription("We are looking for a person with 5 years of experience");
        jobListing6.setListingDate(new Date());
        jobListing6.setEndDate(new Date(2024, 1, 25));
        jobListing6.setEmployer(employer2);
        jobListing6.setApplicants(Set.of(applicant18));

        JobListing jobListing7 = new JobListing();
        jobListing7.setTitle("Middle Ruby developer");
        jobListing7.setDescription("We are looking for a person with 3 years of experience");
        jobListing7.setListingDate(new Date());
        jobListing7.setEndDate(new Date(2023, 10, 12));
        jobListing7.setEmployer(employer2);
        jobListing7.setApplicants(Set.of(applicant3, applicant5, applicant13));

        JobListing jobListing8 = new JobListing();
        jobListing8.setTitle("Senior Ruby developer");
        jobListing8.setDescription("We are looking for a person with 7 years of experience");
        jobListing8.setListingDate(new Date());
        jobListing8.setEndDate(new Date(2023, 12, 30));
        jobListing8.setEmployer(employer2);
        jobListing8.setApplicants(Set.of(applicant16, applicant4));

        List<Employer> employers = employerService.saveAllEmployers(List.of(employer1, employer2));

        List<Applicant> applicants = applicantService.saveAllApplicants(List.of(applicant1, applicant2, applicant3, applicant4, applicant5, applicant6,
                applicant7, applicant8, applicant9, applicant10, applicant11, applicant12, applicant13, applican14, applicant15,
                applicant16, applicant17, applicant18, applicant19, applicant20));

        List<JobListing> jobListings = jobListingService.saveAllJobListing(List.of
                (jobListing1, jobListing2, jobListing3, jobListing4, jobListing5, jobListing6, jobListing7, jobListing8));

        AllData allData = new AllData();
        allData.setApplicantList(applicants);
        allData.setEmployerList(employers);
        allData.setJobListingList(jobListings);

        return allData;
    }

}
