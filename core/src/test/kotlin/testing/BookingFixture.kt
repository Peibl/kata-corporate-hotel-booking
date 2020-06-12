package testing

import domain.models.Booking
import java.time.LocalDate
import java.util.*

object BookingFixture {
    fun aBookingId() = 221
    fun anEmployeeId() = 2
    fun anHotelId() = 1
    fun aRoomType() = "A Room Type"
    fun aCheckInDate() = LocalDate.of(2020, 6, 29)
    fun aCheckOutDate() = LocalDate.of(2020, 6, 30)

    fun aBookingWith(
        bookingId: Int = aBookingId(),
        employeeId: Int = anEmployeeId(),
        hotelId: Int = anHotelId(),
        roomType: String = aRoomType(),
        checkInDate: LocalDate = aCheckInDate(),
        checkOutDate: LocalDate = aCheckOutDate()
    ): Booking {
        return Booking(bookingId, employeeId, hotelId, roomType, checkInDate, checkOutDate)
    }

    fun aBooking() = aBookingWith()
}
