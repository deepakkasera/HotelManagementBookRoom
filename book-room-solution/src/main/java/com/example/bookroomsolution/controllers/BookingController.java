package com.example.bookroomsolution.controllers;

import com.example.bookroomsolution.dtos.MakeBookingRequestDto;
import com.example.bookroomsolution.dtos.MakeBookingResponseDto;
import com.example.bookroomsolution.dtos.ResponseStatus;
import com.example.bookroomsolution.models.Booking;
import com.example.bookroomsolution.services.BookingService;

public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public MakeBookingResponseDto makeBooking(MakeBookingRequestDto makeBookingRequestDto) {
        MakeBookingResponseDto responseDto = new MakeBookingResponseDto();
        try {
            Booking booking = bookingService.makeBooking(makeBookingRequestDto.getUserId(), makeBookingRequestDto.getBookedRooms());
            responseDto.setBooking(booking);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}
