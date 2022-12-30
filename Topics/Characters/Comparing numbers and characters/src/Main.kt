fun main() {
    val checkNumber = readln().toInt()    // or with ".toChar" &&
    val checkChar = readln().first().code // && with out ".code"
    println(checkNumber == checkChar)
    // write your code here
}