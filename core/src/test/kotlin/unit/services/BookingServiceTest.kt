package unit.services

import domain.models.Booking
import domain.models.Bookings
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import services.BookingService

import java.util.*

internal class BookingServiceTest {

    @Test
    fun book() {
        every { bookings.nextId() } returns  aBookId

       bookingService.book(anEmployeeId, anHotelId, aRoomType, aCheckInDate, aCheckOutDate)

        verify { bookings.add(Booking(aBookId, anEmployeeId, anHotelId, aRoomType, aCheckInDate, aCheckOutDate)) }
    }

    private val bookings = mockk<Bookings>(relaxed = true)
    private val bookingService = BookingService(bookings)
    private val aBookId = 221
    private val anEmployeeId = 2
    private val anHotelId = 1
    private val aRoomType = "A Room Type"
    private val aCheckInDate = Date()
    private val aCheckOutDate = Date()
}
