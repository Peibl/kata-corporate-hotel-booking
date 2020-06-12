package unit.infrastructure

import domain.models.Hotel
import infrastructure.InMemoryHotels
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InMemoryHotelsTest {
    @Test
    fun `Hotel is added on Add`() {
        val aHotel = Hotel(aHotelId, aHotelName)
        val hotels = InMemoryHotels()

        hotels.add(aHotel)

        val newHotel = hotels.findById(aHotelId)
        assertThat(aHotel).isEqualTo(newHotel)
    }

    private val aHotelId = 1
    private val aHotelName = "Hotel Name"
}
