package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.sample.service.DoctorService;
import com.example.sample.service.UserService;
import com.example.sample.entity.DoctorEntity;
import com.example.sample.entity.DoctorScheduleEntity;
import com.example.sample.entity.UserEntity;
import com.example.sample.service.DoctorScheduleService;

@Controller
public class BookController {
    @Autowired
    DoctorScheduleService doctorScheduleService;

    @Autowired
    DoctorService doctorService;

    @Autowired
    UserService userService;

    @GetMapping("/book")
    public String bookAppointment(Model model) {
        model.addAttribute("schedules", doctorScheduleService.fetchSchedules());
        model.addAttribute("doctors", doctorService.fetchDoctors());
        return "book_appointment";
    }

    @PostMapping("/book/confirm")
    public String confirmAppointment(
        @RequestParam("schedule") Integer schedule_id,
        @RequestParam("user") Integer user_id,
        Model model
    ) {
        DoctorScheduleEntity selected_schedule = doctorScheduleService.find_schedule_by_uuid(schedule_id);
        DoctorEntity selected_doctor = doctorService.find_doctor_by_uuid(selected_schedule.get_doctor_uuid());
        UserEntity user = userService.find_user_by_uuid(user_id);

        model.addAttribute("selected_time", selected_schedule.get_time());
        model.addAttribute("selected_doctor", selected_doctor.get_name());
        model.addAttribute("login_user", user);
        return "confirm_appointment";
    }
}
