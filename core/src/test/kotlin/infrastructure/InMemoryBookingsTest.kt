package infrastructure

import domain.models.Booking
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

internal class InMemoryBookingsTest {

    @Test
    fun `booking is added on add`() {
        val inMemoryBookings = InMemoryBookings()
        val booking = Booking(aBookId, anEmployeeId, anHotelId, aRoomType, aCheckInDate, aCheckOutDate)

        inMemoryBookings.add(booking)

        val newBooking = inMemoryBookings.get(aBookId)
        Assertions.assertThat(booking).isEqualTo(newBooking)
    }

    @Test
    fun `return the next id`() {
        val inMemoryBookings = InMemoryBookings()

        val id = inMemoryBookings.nextId()
        val nextId = inMemoryBookings.nextId()

        Assertions.assertThat(1).isEqualTo(id)
        Assertions.assertThat(2).isEqualTo(nextId)
    }


    private val aBookId = 221
    private val anEmployeeId = 2
    private val anHotelId = 1
    private val aRoomType = "A Room Type"
    private val aCheckInDate = Date()
    private val aCheckOutDate = Date()
}
