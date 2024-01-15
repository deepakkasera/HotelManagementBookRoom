package com.example.bookroomstarter.services;

import com.example.bookroomstarter.exceptions.InvalidRoomException;
import com.example.bookroomstarter.exceptions.UserNotFoundException;
import com.example.bookroomstarter.models.Booking;

import java.util.Map;

public interface BookingService {
    Booking makeBooking(long userId, Map<Long, Integer> roomsToBeBooked) throws UserNotFoundException, InvalidRoomException;
}
