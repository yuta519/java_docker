package com.example.sample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "doctor_schedules")
public class DoctorScheduleEntity {
    @Id
    @GeneratedValue
    private int uuid;

    @Column(name = "doctor_uuid")
    private String email;

    @Column(name = "time")
    private String time;
}
