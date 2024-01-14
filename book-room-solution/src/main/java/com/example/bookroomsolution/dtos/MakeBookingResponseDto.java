package com.example.bookroomsolution.dtos;

import com.example.bookroomsolution.controllers.BookingController;
import com.example.bookroomsolution.models.Booking;

import java.awt.print.Book;

public class MakeBookingResponseDto {
    private Booking booking;
    private ResponseStatus responseStatus;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
