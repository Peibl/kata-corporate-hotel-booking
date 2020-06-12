package infrastructure

import domain.models.Employee
import domain.models.Employees

class InMemoryEmployees : Employees {
    private val employees = mutableListOf<Employee>()

    override fun add(employee: Employee) {
        this.employees.add(employee)
    }

    override fun findById(id: Int) = this.employees.single { it.employeeId == id }
}
