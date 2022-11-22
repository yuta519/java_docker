package com.example.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.sample.service.DoctorScheduleService;
import com.example.sample.service.UserService;

@Controller
public class BookController {
    @Autowired
    DoctorScheduleService doctorScheduleService;

    @Autowired
    UserService userService;

    @GetMapping("/book")
    public String geeting(
        @RequestParam(name = "name", required = false, defaultValue = "World") String name,
        Model model
    ) {
        model.addAttribute("name", name);
        model.addAttribute("users", userService.fetchUsers());
        model.addAttribute("schedules", doctorScheduleService.fetchSchedules());
        return "book_appointment";
    }
}
