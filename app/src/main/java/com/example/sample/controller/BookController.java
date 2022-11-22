package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.sample.service.DoctorService;
import com.example.sample.service.DoctorScheduleService;

@Controller
public class BookController {
    @Autowired
    DoctorScheduleService doctorScheduleService;

    @Autowired
    DoctorService doctorService;

    @GetMapping("/book")
    public String geeting(
        Model model
    ) {
        model.addAttribute("schedules", doctorScheduleService.fetchSchedules());
        model.addAttribute("doctors", doctorService.fetchDoctors());
        return "book_appointment";
    }
}
