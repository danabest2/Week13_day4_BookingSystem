package com.codeclan.bookingsystem.BookingSystemLab.repositories.CustomerRepository;

import com.codeclan.bookingsystem.BookingSystemLab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomersByCourse(Long courseId);

    List<Customer> findCustomerByTownAndCourse(String town, String course);

    List<Customer> findCustomerOverAgeByTownAndCourse(int age, String town, String course);
}
