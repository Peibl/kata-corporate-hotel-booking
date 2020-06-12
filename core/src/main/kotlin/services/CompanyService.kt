package services

import domain.models.Employee
import domain.models.Employees

class CompanyService(private val employees: Employees) {

    fun addEmployee(companyId: Int, employeeId: Int) {
        employees.add(Employee(companyId, employeeId))
    }
}
