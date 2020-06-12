package domain.models

class Employee(companyId: Int, employeeId: Int) {
    var companyId = companyId
        private set
    var employeeId = employeeId
        private set

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Employee

        if (employeeId != other.employeeId) return false

        return true
    }

    override fun hashCode(): Int {
        return employeeId
    }


}
