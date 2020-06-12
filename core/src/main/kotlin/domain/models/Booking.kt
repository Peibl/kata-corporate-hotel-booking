package domain.models

import java.util.*

class Booking(val employeeId: Int, val hotelId: Int, val roomType: String, val checkIn: Date, val checkOut: Date)
