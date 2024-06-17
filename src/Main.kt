
//Cómo convertir una sentencia if en una expresión
fun main() {
    val trafficLightColor = "Amber"

    val message = when(trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Proceed with caution."
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }
    println(message)
}



//Cómo agregar una condición adicional con el mismo cuerpo
/*fun main() {
    val trafficLightColor = "Amber"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow", "Amber" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}*/

//numeros primos
/*fun main() {
    val x: Any = 20

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
}
*/


//como usar una sentencia when para varias ramas
/*fun main() {
    val trafficLightColor = "Yellow"
    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "green" -> println("go")
        else -> println("Invalid traffic-light color")
    }
    }
*/



//como usar sentencias if/else para expresar condiciomes
 /*fun main() {
    val trafficLightColor = "black"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else if (trafficLightColor == "green") {
        println("Go")
    } else {
        println("Invalid traffic-light color")
    }
}
*/