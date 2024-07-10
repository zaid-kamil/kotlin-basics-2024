data class Actor(
    val name: String,
    val gender: String = "M"
)

data class Message(
    val dp: String,
    val name: String,
    val last_msg: String,
    val time: String,
    val status: String,
    val isNotification: Boolean
)

fun main() {
    val actor = Actor("Tom Cruise")
    val actor2 = Actor("Priyanka Chopra", "F️")
    val msg = Message("kachra", "kachra seth", "Kaise ho", "19:05", "double tick", false)
    println(actor)
    println(actor2)
    println(msg)
}