package com.pennant.propertystudio.service;

import com.pennant.propertystudio.models.Apartments;
import com.pennant.propertystudio.repositories.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService {

    private final ApartmentRepository apartmentRepository;

    @Autowired
    public ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    public List<Apartments> getAllApartments() {
        return apartmentRepository.findAll();
    }

    public void saveApartment(Apartments apartment) {
        apartmentRepository.save(apartment);
    }
}
