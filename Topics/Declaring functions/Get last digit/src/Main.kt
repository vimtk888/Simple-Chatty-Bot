import kotlin.math.*
fun getLastDigit(digit: Int) = abs(digit - digit / 10 * 10)

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}