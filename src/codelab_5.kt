//Cómo escribir expresiones lambda con sintaxis abreviada
//Cómo usar una función como tipo de datos que se muestra
fun main() {
    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, null)
    repeat(4) {
        treatFunction()
    }
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)? = null): () -> Unit {
    if (isTrick) {
        return trick
    } else {

        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}


// Cómo usar funciones como un tipo de datos
/*fun main() {
    val trickFunction = trick
    trick()
    trickFunction()
    treat()
}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println ("have a treat!")
}
*/
