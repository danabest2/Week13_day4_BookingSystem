package com.codeclan.bookingsystem.BookingSystemLab;

import com.codeclan.bookingsystem.BookingSystemLab.models.Booking;
import com.codeclan.bookingsystem.BookingSystemLab.models.Course;
import com.codeclan.bookingsystem.BookingSystemLab.models.Customer;
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

	//Get all customers for a given course

	@Test
	public void getCustomersByCourse() {
		List<Customer> found = customerRepository.findCustomersByCourse(1L);
		assertEquals("Sarah", found.get(0).getName());
	}

	@Test
	public void getCoursesByCustomer() {
		List<Course> found = courseRepository.findCoursesByCustomer(1L);
		assertEquals("Java", found.get(0).getName());
	}

	@Test
	public void findAllBookingsByDate() {
		List<Booking> found = bookingRepository.findBookingsByDate("10-12-19");
		assertEquals("10-12-19", found.get(0).getDate());
	}
}
