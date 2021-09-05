import kotlin.math.pow

// write your code here
fun square(number: Int) = number.toDouble().pow(2).toInt()

/* Do not change code below */
fun main() {
    val number = readLine()!!.toInt()
    println(square(number))
}