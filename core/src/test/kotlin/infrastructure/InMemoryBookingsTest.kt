package infrastructure

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import testing.BookingFixture
import testing.BookingFixture.aBookingId
import testing.BookingFixture.aBookingWith

internal class InMemoryBookingsTest {

    @Test
    fun `booking is added on add`() {
        val inMemoryBookings = InMemoryBookings()
        val booking = aBookingWith(aBookingId)

        inMemoryBookings.add(booking)

        val newBooking = inMemoryBookings.get(aBookingId)
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

    private val aBookingId = aBookingId()
}
