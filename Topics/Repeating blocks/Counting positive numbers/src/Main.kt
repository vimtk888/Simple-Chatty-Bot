fun main() {
    val howLong = readln().toInt()
    var positive = 0
    repeat(howLong) {
        val num = readln().toInt()
        if (num > 0) positive ++
    }
    println(positive)
}