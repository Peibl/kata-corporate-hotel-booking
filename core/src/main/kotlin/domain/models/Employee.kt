package domain.models

class Employee(companyId: Int, employeeId: Int) {
    var companyId = companyId
        private set
    var employeeId = employeeId
        private set
}
