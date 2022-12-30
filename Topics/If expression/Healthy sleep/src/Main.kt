fun main() {    
    val min = readln().toInt()
    val max = readln().toInt()
    val sleeps = readln().toInt()
    if (sleeps < min) {
        println("Deficiency")
    } else if (sleeps <= max) {
        println("Normal")
    } else {
        println("Excess")
    }
}