fun main() {
    val penautsNumber = readln().toInt()
    val dayOfTheWeek = readln().toBoolean()
    println((dayOfTheWeek == true && penautsNumber >= 15 && penautsNumber <= 25) || (dayOfTheWeek != true && penautsNumber >= 10 && penautsNumber <= 20))
    // write your code here
}
