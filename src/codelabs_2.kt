//Usa el operador Elvis
/*fun main() {
    val favoriteActor: String? = "Sandra Oh"

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}
*/
//Expresiones if/else
/*fun main() {
    val favoriteActor: String? = "Sandra Oh"

    val lengthOfName = if(favoriteActor != null) {
        favoriteActor.length
    } else {
        0
    }

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}
*/
//Usa los condicionales if/else
/*fun main() {
    var favoriteActor: String? = null

    if(favoriteActor != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
        println("You didn't input a name.")
    }
}
*/

/*fun main() {
    var favoriteActor: String? = "Sandra Oh"

    if (favoriteActor != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    }
}
*/
/*fun main() {
    var favoriteActor: String? = null
    println(favoriteActor!!.length)
}
*/

/*fun main() {
    var favoriteActor: String? = null
    println(favoriteActor?.length)
}
*/


/*fun main() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor?.length)
}
/*

//Cómo acceder a una propiedad de una variable anulable
/*fun main() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor.length)
}



//Procesa variables anulables
/*fun main() {
    var favoriteActor: String = "Sandra Oh"
    println(favoriteActor.length)
}
*/



//Agrega otra sentencia println(number)
/*fun main() {
    var number: Int? = 10
    println(number)

    number = null
    println(number)
}
*/

//Escribe un valor Int anulable
/*fun main() {
    var number: Int? = 10
    println(number)
}
*/

/*fun main() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
}
/*
//Información sobre variables anulables y no anulables
/*fun main() {
    var favoriteActor: String = "Sandra Oh"
    favoriteActor = null
}
*/