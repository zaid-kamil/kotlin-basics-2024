import kotlin.math.pow


fun summer(a: Int, b: Int, c: Int = 0) = a + b + c
fun power(num: Int, exp: Int = 2) = num.toDouble().pow(exp)

fun main() {
    val ans = summer(10, 20, 30)
    print("Answer:")
    println(ans)
    val ans2 = summer(10, 20)
    print("Answer2:")
    println(ans2)
    val ans3 = power(2, 3)
    println(ans3)
    val ans4 = power(10)
    println(ans4)
}