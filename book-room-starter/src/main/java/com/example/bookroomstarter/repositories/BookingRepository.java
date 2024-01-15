package com.example.bookroomstarter.repositories;

import com.example.bookroomstarter.models.Booking;

public interface BookingRepository {
    Booking save(Booking booking);
}
