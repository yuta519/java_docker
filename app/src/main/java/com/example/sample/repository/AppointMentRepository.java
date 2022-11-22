package com.example.sample.repository;

import com.example.sample.entity.AppointmentEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointMentRepository extends JpaRepository<AppointmentEntity, Integer> {}
