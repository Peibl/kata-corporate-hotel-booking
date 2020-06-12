package infrastructure

import domain.models.Booking
import domain.models.Bookings

class InMemoryBookings : Bookings {
    private val bookings = mutableListOf<Booking>()
    private var nextId = 0

    override fun get(id: Int) = bookings.single { it.id == id }

    override fun nextId() = ++nextId

    override fun add(booking: Booking) {
        bookings.add(booking)
    }
}
