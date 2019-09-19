package com.codeclan.bookingsystem.BookingSystemLab.repositories.CustomerRepository;

import com.codeclan.bookingsystem.BookingSystemLab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomersByCourse(Long courseId);
}
