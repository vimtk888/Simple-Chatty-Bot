fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    //println(totalSeconds)
    val secondsLeft = totalSeconds % 60
    val seconds = totalSeconds / 60
    val minutesLeft = seconds % 60
    val minutes = seconds / 60
    val hoursLeft = minutes % 24
    val hours = minutes / 24
    println("$hoursLeft:$minutesLeft:$secondsLeft")


    // enter your code
}