package com.assignment.medicineappbackend.service;

import com.assignment.medicineappbackend.model.Medicine;
import com.assignment.medicineappbackend.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class MedicineService {
    @Autowired
    private MedicineRepository medicineRepository;
    public List<Medicine> listAllMedicines() {
        return medicineRepository.findAll();
    }

    public void saveMedicine(Medicine medicine) {
        medicineRepository.save(medicine);
    }

    public Medicine getMedicine(Integer id) {
        return medicineRepository.findById(id).get();
    }

    public void deleteMedicine(Integer id) {
        medicineRepository.deleteById(id);
    }
}