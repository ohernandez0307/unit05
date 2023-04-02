fun fallingDistance(t: Double): Double {
    val g = 9.8
    val d = 0.5 * (g * (t * t))
    return d

}
fun main() {
    for (i in 1..10) {
        val distance = fallingDistance(i.toDouble())
        println("The distance fallen for $i seconds is ${"%.2f".format(distance)} meters")
    }
}