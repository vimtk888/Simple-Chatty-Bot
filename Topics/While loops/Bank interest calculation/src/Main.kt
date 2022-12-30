fun findYears(depo: Double): Int {
    var deposit = depo
    val interestRate = 1.071
    val max = 700000
    var years = 0
    while (deposit <= max) {
        years ++
        deposit = deposit * interestRate
    }
    // println(years)
    return years
}
// dear authors: to pass the check of the code above i had to disable
// the next code...
// WHY !
/*
fun main() {
    var depo = readln().toDouble()
    println(findYears(depo))
}
*/
