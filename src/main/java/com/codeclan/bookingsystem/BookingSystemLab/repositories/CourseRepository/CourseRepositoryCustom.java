package com.codeclan.bookingsystem.BookingSystemLab.repositories.CourseRepository;

import com.codeclan.bookingsystem.BookingSystemLab.models.Course;
import com.codeclan.bookingsystem.BookingSystemLab.models.Customer;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findCoursesByCustomer(Long customerId);
}
