package com.example.bookroomsolution.services;

import com.example.bookroomsolution.exceptions.InvalidRoomException;
import com.example.bookroomsolution.exceptions.UserNotFoundException;
import com.example.bookroomsolution.models.Booking;

import java.util.Map;

public class BookingServiceImpl implements BookingService {

    @Override
    public Booking makeBooking(long userId, Map<Long, Integer> roomsToBeBooked) throws UserNotFoundException, InvalidRoomException {
        return null;
    }
}
