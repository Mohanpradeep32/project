package com.pennant.propertystudio.repositories;

import com.pennant.propertystudio.models.Apartments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartments, Integer> {
}
