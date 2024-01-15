package com.example.bookroomstarter.controllers;

import com.example.bookroomstarter.dtos.MakeBookingRequestDto;
import com.example.bookroomstarter.dtos.MakeBookingResponseDto;
import com.example.bookroomstarter.dtos.ResponseStatus;
import com.example.bookroomstarter.models.Booking;
import com.example.bookroomstarter.services.BookingService;

public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public MakeBookingResponseDto makeBooking(MakeBookingRequestDto makeBookingRequestDto) {
        return null;
    }
}
