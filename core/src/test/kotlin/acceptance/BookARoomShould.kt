package acceptance

import infrastructure.InMemoryBookings
import infrastructure.InMemoryEmployees
import infrastructure.InMemoryHotels
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import services.BookingService
import services.CompanyService
import services.HotelService
import testing.BookingFixture.aCheckInDate
import testing.BookingFixture.aCheckOutDate
import testing.BookingFixture.aRoomType
import testing.BookingFixture.anEmployeeId
import testing.BookingFixture.anHotelId

class BookARoomShould {

    @Test
    fun `create a booking for an hotel`() {
        hotelService.addHotel(anHotelId(), anHotelName)
        companyService.addEmployee(aCompanyId, anEmployeeId())

        val booking = bookingService.book(anEmployeeId(), anHotelId(), aRoomType(), aCheckInDate(), aCheckOutDate())

        assertThat(booking.employeeId).isEqualTo(anEmployeeId())
        assertThat(booking.hotelId).isEqualTo(anHotelId())
        assertThat(booking.roomType).isEqualTo(aRoomType())
        assertThat(booking.checkIn).isEqualTo(aCheckInDate())
        assertThat(booking.checkOut).isEqualTo(aCheckOutDate())
    }

    private val anHotelName = "Hotel Name"
    private val aCompanyId = 158
    private val bookingService = BookingService(InMemoryBookings())
    private val hotelService = HotelService(InMemoryHotels())
    private val companyService = CompanyService(InMemoryEmployees())
}
