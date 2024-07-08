class Person(
    val name: String,
    var age: Int,
    var height: Float,
    var weight: Float,
    val gender: String = "female",
    var isMarried: Boolean = false,
    var hairColor: String = "black"
) {
    fun show() {
        println("$name is $age old")
        println("gender: $gender")
        println("is married: $isMarried")
        println("height: $height")
        println("weight: $weight")
        println("hair color: $hairColor")
    }
}

fun main() {
    val p1 = Person("ajay", 23, 6f, 67f, "male", hairColor = "brown")
    val p2 = Person("arti", 20, 5.5f, 50f)
    p1.show()
    p2.show()
}