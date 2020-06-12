package domain.models

import java.util.*

class Booking(val id: Int, val employeeId: Int, val hotelId: Int, val roomType: String, val checkIn: Date, val checkOut: Date){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Booking

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }
}
