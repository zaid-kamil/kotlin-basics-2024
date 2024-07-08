fun main() {
    greetings()
}

fun si(p: Int, r: Float, t: Int) =  p * r * t / 100


fun greetings() {
    println("☀️☀️☀️☀️☀️")
    println("Good Morning")
    println("☀️☀️☀️☀️☀️")
    val result = si(10000, 2.2f, 5)
    println(result)
}

fun areaCube(side: Int) = side * side * side
