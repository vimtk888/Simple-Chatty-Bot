fun main() {
    var sum = 0
    do {
        var num = readln().toInt()
        sum = sum + num
    } while (num > 0)
    println(sum)
}