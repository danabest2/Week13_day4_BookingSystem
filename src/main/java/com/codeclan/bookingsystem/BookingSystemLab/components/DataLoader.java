package com.codeclan.bookingsystem.BookingSystemLab.components;

import com.codeclan.bookingsystem.BookingSystemLab.models.Booking;
import com.codeclan.bookingsystem.BookingSystemLab.models.Course;
import com.codeclan.bookingsystem.BookingSystemLab.models.Customer;
import com.codeclan.bookingsystem.BookingSystemLab.repositories.BookingRepository.BookingRepository;
import com.codeclan.bookingsystem.BookingSystemLab.repositories.CourseRepository.CourseRepository;
import com.codeclan.bookingsystem.BookingSystemLab.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;


    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("Walter", "Munich", 50);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Sarah", "Copenhagen", 40);
        customerRepository.save(customer2);

        Course course1 = new Course("Ruby", "Copenhagen", 4);
        courseRepository.save(course1);

        Course course2 = new Course("Java", "Munich", 5);
        courseRepository.save(course2);

        Booking booking1 = new Booking("10-12-19", customer1, course2);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("20-12-19", customer2, course1);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("20-12-19", customer1, course1);
        bookingRepository.save(booking3);

    }
}
