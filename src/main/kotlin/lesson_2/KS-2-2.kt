package lesson_2

fun main() {

    val permanentStaff: Short = 50
    val intern: Short = 30
    val permanentStaffSalary: Int = 30000
    val internSalary: Int = 20000

    val salaryExpensesPermanentStaff: Int
    val salaryExpensesAllStaff: Int
    val averageSalaryAllStaff: Int

    salaryExpensesPermanentStaff = permanentStaffSalary * permanentStaff
    salaryExpensesAllStaff = salaryExpensesPermanentStaff + internSalary * intern
    averageSalaryAllStaff = salaryExpensesAllStaff / (permanentStaff + intern)

    println(salaryExpensesPermanentStaff)
    println(salaryExpensesAllStaff)
    println(averageSalaryAllStaff)

}