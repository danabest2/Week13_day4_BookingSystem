package com.codeclan.bookingsystem.BookingSystemLab;

import com.codeclan.bookingsystem.BookingSystemLab.models.Course;
import com.codeclan.bookingsystem.BookingSystemLab.repositories.BookingRepository.BookingRepository;
import com.codeclan.bookingsystem.BookingSystemLab.repositories.CourseRepository.CourseRepository;
import com.codeclan.bookingsystem.BookingSystemLab.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingSystemLabApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findAllCoursesWithRating() {
		List<Course> found = courseRepository.findCoursesByStarRating(5);
		assertEquals("Java", found.get(0).getName());
	}


}
