package com.example.sample.service;

import com.example.sample.entity.DoctorEntity;
import com.example.sample.repository.DoctorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    public List<DoctorEntity> fetchDoctors() {
        return doctorRepository.findAll();
    }
}
