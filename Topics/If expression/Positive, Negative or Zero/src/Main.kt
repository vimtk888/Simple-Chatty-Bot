fun main() {
    val num = readln().toInt()
    if (num > 0) { println("positive") } else if (num == 0) { println("zero") } else println("negative")
}
//println(if (num < 0) "negative" else if (num > 0) "positive" else "zero")