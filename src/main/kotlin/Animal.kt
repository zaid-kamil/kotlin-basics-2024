open class Animal(
    group: String? = null
) {
    fun eat() {
        println("Animal Eats")
    }

    fun sleep() {
        println("Animal Sleeps")
    }
}

class Monkey : Animal(group = "mammal") {
    fun jump() {
        println("jumps around")
    }
}

class Crocodile : Animal(group = "reptile") {
    fun hunting() {
        println("Hunts in water")
    }
}

fun main() {
    val o1 = Monkey()
    val o2 = Crocodile()
    o1.eat()
    o1.sleep()
    o2.sleep()
    o2.eat()
}