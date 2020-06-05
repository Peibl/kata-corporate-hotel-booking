package com.kata.service

import infrastructure.InMemoryHotels
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import domain.services.HotelService

class AddHotelFeature {

    @Test
    fun `add an hotel`() {
        val aHotelId = 1
        val aHotelName = "Hotel Name"
        val hotels = InMemoryHotels()
        val hotelService = HotelService(hotels)

        hotelService.addHotel(aHotelId, aHotelName)

        val hotelName = hotelService.findHotelBy(aHotelId)
        assertThat(hotelName).isEqualTo(aHotelName)
    }


    @BeforeEach
    fun beforeEach() {
    }

}
