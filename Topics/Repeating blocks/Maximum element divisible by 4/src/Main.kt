fun main() {
    val elements = readln().toInt()
    var maxNumber = 0
    repeat(elements) {
        val number = readln().toInt()
        if (number % 4 == 0 && number > maxNumber) {
            maxNumber = number
        }
    }
    println(maxNumber)
}