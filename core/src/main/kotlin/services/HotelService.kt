package services

import domain.models.Hotel
import domain.models.Hotels

class HotelService(private val hotels: Hotels) {

    fun addHotel(hotelId: Int, hotelName: String) {
        val hotel = Hotel(hotelId, hotelName)
        hotels.add(hotel)
    }
}
