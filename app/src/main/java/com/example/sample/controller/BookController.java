package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.sample.service.DoctorService;
import com.example.sample.entity.DoctorEntity;
import com.example.sample.entity.DoctorScheduleEntity;
import com.example.sample.service.DoctorScheduleService;

@Controller
public class BookController {
    @Autowired
    DoctorScheduleService doctorScheduleService;

    @Autowired
    DoctorService doctorService;

    @GetMapping("/book")
    public String bookAppointment(Model model) {
        model.addAttribute("schedules", doctorScheduleService.fetchSchedules());
        model.addAttribute("doctors", doctorService.fetchDoctors());
        return "book_appointment";
    }

    @PostMapping("/book/confirm")
    public String confirmAppointment(
        @RequestParam("schedule") Integer schedule_id,
        Model model
    ) {
        // POST params must be filled
        if (schedule_id == null) { return "redirect:/book"; }

        DoctorScheduleEntity selected_schedule = doctorScheduleService.find_schedule_by_uuid(schedule_id);
        DoctorEntity selected_doctor = doctorService.find_doctor_by_uuid(selected_schedule.get_doctor_uuid());

        model.addAttribute("selected_time", selected_schedule.get_time());
        model.addAttribute("selected_doctor", selected_doctor.get_name());
        return "confirm_appointment";
    }
}
