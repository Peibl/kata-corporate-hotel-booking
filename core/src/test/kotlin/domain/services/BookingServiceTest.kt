package domain.services

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.util.*

internal class BookingServiceTest {

    @Test
    fun book() {

        val booking = bookingService.book(anEmployeeId, anHotelId, aRoomType, aCheckInDate, aCheckOutDate)

    }

    private val bookingService = BookingService()
    private val anEmployeeId = 2
    private val anHotelId = 1
    private val aRoomType = "A Room Type"
    private val aCheckInDate = Date()
    private val aCheckOutDate = Date()
}
