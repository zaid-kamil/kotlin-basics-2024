open class Human(
    open val name: String,
    open val age: Int,
    open val gender: String = "M"
) {
    open fun detail() {
        println("I am $name")
        println("I am $age yrs old")
        when (gender){
            "M" -> println("I am Male")
            "F" -> println("I am Female")
        }
    }
}

class Student(
    override val name: String,
    override val age: Int,
    override val gender: String,
    val school: String,
    val klass: String
) : Human(name, age, gender) {
    override fun detail(){
        super.detail()
        println("I study in $school")
        println("I am in class $klass")
    }
}

fun main(){
    val h1 = Human("Ravi", 20)
    val s1 = Student("Rani", 18, "F", "KV", "12th")

    h1.detail()
    println("----")
    s1.detail()
}
