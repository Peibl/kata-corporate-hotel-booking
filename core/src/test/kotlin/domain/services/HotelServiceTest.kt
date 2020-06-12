package domain.services

import domain.models.Hotel
import domain.models.Hotels
import domain.services.HotelService
import io.mockk.*
import org.junit.jupiter.api.Test

class HotelServiceTest {

    @Test
    fun `add an hotel`() {
        val aHotelId = 1
        val aHotelName = "Hotel Name"
        val hotelService = HotelService(hotels)

        hotelService.addHotel(aHotelId, aHotelName)

        verify { hotels.add(Hotel(aHotelId, aHotelName)) }
    }

    private val hotels = mockk<Hotels>(relaxed = true)
}
