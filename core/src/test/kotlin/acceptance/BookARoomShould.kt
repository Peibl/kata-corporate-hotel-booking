package acceptance

import domain.services.BookingService
import domain.services.CompanyService
import domain.services.HotelService
import infrastructure.InMemoryEmployees
import infrastructure.InMemoryHotels
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.*

class BookARoomShould {

    @Test
    fun `create a booking for an hotel`() {
        hotelService.addHotel(anHotelId, anHotelName)
        companyService.addEmployee(aCompanyId, anEmployeeId)

        val booking = bookingService.book(anEmployeeId, anHotelId, aRoomType, aCheckInDate, aCheckOutDate)

        assertThat(booking.employeeId).isEqualTo(anEmployeeId)
        assertThat(booking.hotelId).isEqualTo(anHotelId)
        assertThat(booking.roomType).isEqualTo(aRoomType)
        assertThat(booking.checkIn).isEqualTo(aCheckInDate)
        assertThat(booking.checkOut).isEqualTo(aCheckOutDate)
    }

    private val anEmployeeId = 2
    private val anHotelName = "Hotel Name"
    private val anHotelId = 1
    private val aRoomType = "A Room Type"
    private val aCheckInDate = Date()
    private val aCheckOutDate = Date()
    private val aCompanyId = 158
    private val bookingService = BookingService()
    private val hotelService = HotelService(InMemoryHotels())
    private val companyService = CompanyService(InMemoryEmployees())
}
