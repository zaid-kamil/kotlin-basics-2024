// interfaces
interface Vehicle {
    fun start() // declare methods
    fun stop()  // declare methods
}
class Car() : Vehicle {
    override fun start() {
        println("Car is Starting")
    }

    override fun stop() {
        println("Car is Stopping")
    }

}

class Truck() : Vehicle {
    override fun start() {
        println("Truck is starting")
    }

    override fun stop() {
        println("Truck stopped")
    }
}

abstract class Smartphone{
    open fun takePicture(){
        println("function to take picture")
    }
    fun takeCall(){
        println("function to take calls")
    }
}

class Iphone: Smartphone(){
    override fun takePicture(){
        println("Function to take picture with Iphone")
    }
}


fun main() {
    val i1 = Iphone()
    val c1 = Car()
    val t1 = Truck()
    c1.start()
    t1.start()
    c1.stop()
    t1.stop()
    i1.takePicture()
    i1.takeCall()
}