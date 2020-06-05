package domain.models

interface Hotels {
    fun add(hotel: Hotel)
    fun findById(id: Int): Hotel
}
