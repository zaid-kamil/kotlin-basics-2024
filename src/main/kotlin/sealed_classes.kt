// best example will be when we implement this in ViewModels
sealed class Error(val message: String) {
    class NetworkError : Error("Network Failure")
    class DatabaseError : Error("Database error")
    class UnknownError : Error("Unknown Error Occurred")
}

fun main() {
    val ne = Error.NetworkError()
    val ue = Error.UnknownError()
    println(ne.message)
    println(ue.message)
}