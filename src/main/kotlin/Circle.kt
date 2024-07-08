class Circle(
    val radius: Int
) {
    init {
        println("Circle object created!!")
    }
    fun circumference() = 2 * Math.PI * radius
    fun area() = Math.PI * radius * radius

}

fun main() {
    print("Enter radius of circle =")
    val r = readln().toInt()
    val c1 = Circle(r)
    println("Circle with radius ${c1.radius}")
    println("Area will be ${c1.area()}")
    println("Circumference will be ${c1.circumference()}")
}