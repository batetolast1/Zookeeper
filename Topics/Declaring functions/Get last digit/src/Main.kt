import kotlin.math.abs

// write your code here
fun getLastDigit(number: Int) = abs(number % 10)

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}