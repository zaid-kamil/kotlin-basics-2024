fun main() {
    var a: Int? = 0
    println(a)
    a = null
    println(a)

    var name: String? = null
    println(name)
    name = readLine()
//    name = null
    println(name)
    println(name?.length ?: "No length available")
    println(name?.isBlank() ?: "No data available")
    // ? nullability operator
    // ?. null check OR null safety operator
    // ?: elvis operator

    // TODO: will update code here
}