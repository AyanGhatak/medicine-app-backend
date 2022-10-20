package com.assignment.medicineappbackend.controller;

import com.assignment.medicineappbackend.model.Medicine;
import com.assignment.medicineappbackend.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/medicines")
public class MedicineController {
    @Autowired
    MedicineService medicineService;

    @GetMapping("")
    public List<Medicine> list() {
        return medicineService.listAllMedicines();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicine> get(@PathVariable Integer id) {
        try {
            Medicine user = medicineService.getMedicine(id);
            return new ResponseEntity<Medicine>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Medicine>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Medicine user) {
        medicineService.saveMedicine(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Medicine user, @PathVariable Integer id) {
        try {
            Medicine existUser = medicineService.getMedicine(id);
            user.setId(id);
            medicineService.saveMedicine(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        medicineService.deleteMedicine(id);
    }
}