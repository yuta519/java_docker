package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.sample.service.AppointmentService;

@Controller
public class AppointmentController {
    @Autowired
    AppointmentService appointmentService;

    @GetMapping("/appointments")
    public String getAppointments(Model model) {
        model.addAttribute("appointments", appointmentService.get_appointments());
        return "appointments";
    }
}
