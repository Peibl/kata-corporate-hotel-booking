package domain.models

interface Bookings {
    fun nextId(): Int
    fun add(booking: Booking)
    fun get(id: Int): Booking
}
