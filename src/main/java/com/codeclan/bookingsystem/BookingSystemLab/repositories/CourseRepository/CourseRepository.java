package com.codeclan.bookingsystem.BookingSystemLab.repositories.CourseRepository;

import com.codeclan.bookingsystem.BookingSystemLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom{
    List<Course> findCoursesByStarRating(int starRating);
    List<Course> findCoursesByCustomer(Long customerId);

}
