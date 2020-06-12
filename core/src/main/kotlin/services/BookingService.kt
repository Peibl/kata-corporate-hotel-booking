package services

import domain.models.Booking
import domain.models.Bookings
import java.time.LocalDate

class BookingService(private val bookings: Bookings ) {
    fun book(employeeId: Int, hotelId: Int, roomType: String, checkInDate: LocalDate, checkOutDate: LocalDate): Booking {
        val id = bookings.nextId()
        val booking = Booking(id, employeeId, hotelId, roomType, checkInDate, checkOutDate)
        bookings.add(booking)
        return booking
    }
}
