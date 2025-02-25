package com.service;

import com.bean.Booking;
import com.dao.BookingDao;
public class BookingService {
    private BookingDao bookingDAO = new BookingDao();

    public boolean createBooking(Booking booking) {
        return bookingDAO.createBooking(booking);
    }
}

