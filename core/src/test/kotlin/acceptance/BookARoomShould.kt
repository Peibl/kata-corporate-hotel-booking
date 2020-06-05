package acceptance

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import domain.services.BookingService
import java.util.*

class BookARoomShould {

    @Test
    fun `create a booking for an hotel`() {
        val anEmployeeId = 2
        val anHotelName = "Hotel Name"
        val anHotelId = 1
        val aRoomType = "A Room Type"
        val aCheckInDate = Date()
        val aCheckOutDate = Date()
        val bookingService = BookingService()

        val booking = bookingService.book(anEmployeeId, anHotelId, aRoomType, aCheckInDate, aCheckOutDate)

        assertThat(booking.employeeId).isEqualTo(anEmployeeId)
        assertThat(booking.hotelName).isEqualTo(anHotelName)
        assertThat(booking.roomType).isEqualTo(aRoomType)
        assertThat(booking.checkIn).isEqualTo(aCheckInDate)
        assertThat(booking.checkOut).isEqualTo(aCheckOutDate)
    }
}
