fun main() {
    val students = readln().toInt()
    var sumA: Int = 0
    var sumB: Int = 0
    var sumC: Int = 0
    var sumD: Int = 0
    repeat(students) {
        var grade = readln().toInt()
        if (grade == 2) {
            sumD += 1
        } else if (grade == 3) {
            sumC += 1
        } else if (grade == 4) {
            sumB += 1
        } else if (grade == 5) {
            sumA += 1
        }
    }

    print("$sumD $sumC $sumB $sumA")
}