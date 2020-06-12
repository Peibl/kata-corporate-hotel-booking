package infrastructure

import domain.models.Employee
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class InMemoryEmployeesTest {

    @Test
    fun add() {
        val inMemoryEmployees = InMemoryEmployees()
        val employeeId = 5
        val employee = Employee(1, employeeId)

        inMemoryEmployees.add(employee)

        val newEmployee = inMemoryEmployees.findById(employeeId)
        Assertions.assertThat(employee).isEqualTo(newEmployee)
    }
}
