package com.codeclan.bookingsystem.BookingSystemLab.repositories.CustomerRepository;

import com.codeclan.bookingsystem.BookingSystemLab.models.Customer;
import com.codeclan.bookingsystem.BookingSystemLab.repositories.CourseRepository.CourseRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    List<Customer> findCustomersByCourse(Long courseId);
}
