package com.assignment.medicineappbackend.repository;

import com.assignment.medicineappbackend.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
}
