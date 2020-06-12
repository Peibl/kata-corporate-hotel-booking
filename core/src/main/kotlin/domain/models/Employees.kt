package domain.models

interface Employees {
    fun add(employee: Employee)
    fun findById(id: Int): Employee
}
