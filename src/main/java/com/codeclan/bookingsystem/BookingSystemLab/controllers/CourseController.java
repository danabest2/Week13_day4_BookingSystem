package com.codeclan.bookingsystem.BookingSystemLab.controllers;

import com.codeclan.bookingsystem.BookingSystemLab.models.Course;
import com.codeclan.bookingsystem.BookingSystemLab.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")

public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
}

