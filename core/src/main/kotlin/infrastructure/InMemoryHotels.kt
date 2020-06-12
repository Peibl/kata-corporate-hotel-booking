package infrastructure

import domain.models.Hotel
import domain.models.Hotels

class InMemoryHotels: Hotels {
    private val hotels = mutableListOf<Hotel>()
    override fun add(hotel: Hotel) { hotels.add(hotel) }
    override fun findById(id: Int) = hotels.single { it.id == id }
}
