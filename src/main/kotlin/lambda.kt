// maths
// f(x) = x*3 + x + 10

// f(2)

fun main() {
    val f = { x: Int -> x * 3 + x + 10 }
    println(f(12))
    val g = { a: Int, b: Int ->
        val c = a * b + 10
        c * 20 + a - b
    }
    println(g(10, 10))
}