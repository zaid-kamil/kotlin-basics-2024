fun main() {

    val movies = listOf("Suryavansham","Gadar","Avengers:Endgame")
    for (name in movies){
        println("I 💖 $name")
    }

    for(idx in movies.indices){
        println("$idx 👀 ${movies[idx]}")
    }

    for (i in 1..10){
        println("$i 🐟")
    }

    // sum of all digits
    val number = 101923019
    var temp = number
    var total = 0
    while(temp > 0){
        println("$temp => $total")
        total += temp%10
        temp /= 10
    }
    println("Total of $number is $total")

    // about me
    var aboutme = ""
    do {
        print(">>>")
        val line = readln() 
        aboutme += line + "\n"
    } while (line.isNotBlank())
    println("About me\n$aboutme")
}