package unit.services

import domain.models.Employee
import domain.models.Employees
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import services.CompanyService

internal class CompanyServiceTest {

    @Test
    fun addEmployee() {
        val companyService = CompanyService(employees)
        val aCompanyId = 1
        val anEmployeeId = 3

        companyService.addEmployee(aCompanyId, anEmployeeId )

        verify { employees.add(Employee(aCompanyId, anEmployeeId)) }
    }

    private val employees = mockk<Employees>(relaxed = true)
}
