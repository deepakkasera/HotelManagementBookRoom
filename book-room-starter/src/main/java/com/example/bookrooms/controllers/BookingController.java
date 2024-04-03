package com.example.bookrooms.controllers;

import com.example.bookrooms.dtos.MakeBookingRequestDto;
import com.example.bookrooms.dtos.MakeBookingResponseDto;
import com.example.bookrooms.services.BookingService;

public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public MakeBookingResponseDto makeBooking(MakeBookingRequestDto makeBookingRequestDto) {
        return null;
    }
}
