package domain.services

import domain.models.Hotel
import domain.models.Hotels
import infrastructure.InMemoryHotels

class HotelService(private val hotels: Hotels) {

    fun addHotel(hotelId: Int, hotelName: String) {
        val hotel = Hotel(hotelId, hotelName)
        hotels.add(hotel)
    }
}
