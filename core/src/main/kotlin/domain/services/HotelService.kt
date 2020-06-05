package domain.services

import domain.models.Hotel
import infrastructure.InMemoryHotels

class HotelService(private val hotels: InMemoryHotels) {

    fun addHotel(hotelId: Int, hotelName: String) {
        val hotel = Hotel(hotelId, hotelName)
        hotels.add(hotel)
    }

    fun findHotelBy(hotelId: Int): String {
        TODO("Not yet implemented")
    }
}
