package io.datajek.databaserelationships.onetomany.uni.service;

import java.util.List;

import io.datajek.databaserelationships.onetomany.uni.Registration;
import io.datajek.databaserelationships.onetomany.uni.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    RegistrationRepository repo;

    public List<Registration> allRegistrations() {
        return repo.findAll();
    }

    public Registration getRegistration(int id){
        return repo.findById(id).get();
    }

    public Registration addRegistration(Registration registration) {
        registration.setId(0);
        return repo.save(registration);
    }

    public void deleteRegistration(int id) {
        repo.deleteById(id);
    }
}
