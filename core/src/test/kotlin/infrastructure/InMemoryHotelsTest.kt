package infrastructure

import domain.models.Hotel
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InMemoryHotelsTest {
    @Test
    fun add() {
        val aHotelId = 1
        val aHotelName = "Hotel Name"
        val aHotel = Hotel(aHotelId, aHotelName)
        val hotels = InMemoryHotels()

        hotels.add(aHotel)

        val newHotel = hotels.findById(aHotelId)
        assertThat(aHotel).isEqualTo(newHotel)
    }
}
