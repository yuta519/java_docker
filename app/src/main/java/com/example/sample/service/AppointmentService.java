package com.example.sample.service;

import com.example.sample.entity.AppointmentEntity;
import com.example.sample.repository.AppointMentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AppointmentService {
    @Autowired
    AppointMentRepository appointmentRepository;

    public List<AppointmentEntity> get_appointments() {
        return appointmentRepository.findAll();
    }

    public void create(int doctor_schedule_uuid, int user_uuid) {
        AppointmentEntity appoint = new AppointmentEntity();
        appoint.set_doctor_schedule_uuid(doctor_schedule_uuid);
        appoint.set_user_uuid(user_uuid);
        appointmentRepository.save(appoint);
    }
}
