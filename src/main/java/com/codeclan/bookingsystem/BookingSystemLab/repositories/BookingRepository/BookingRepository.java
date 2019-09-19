package com.codeclan.bookingsystem.BookingSystemLab.repositories.BookingRepository;

import com.codeclan.bookingsystem.BookingSystemLab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom{
    List<Booking> findBookingsByDate(String date);
}
