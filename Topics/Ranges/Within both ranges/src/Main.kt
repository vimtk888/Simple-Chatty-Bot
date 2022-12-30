fun main() {
    val one = readln().toInt()
    val two = readln().toInt()
    val three = readln().toInt()
    val four = readln().toInt()
    val five = readln().toInt()
    println(five in one..two && five in three..four)
}