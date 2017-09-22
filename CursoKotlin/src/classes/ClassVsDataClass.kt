package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main(args: Array<String>) {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)

    println(g1 == g2) // equals

    val tv1 = Televisao("Sansung", 32)
    val tv2 = Televisao("Sansung", 32)

    println(tv1 == tv2) // equals
    println(tv1 === tv2)
    println(tv1.toString())
    println(tv1.copy())
    println(tv1.copy(polegadas = 42))

    // Destructuring em data class
    val (marca, pol) = tv1
    println("$marca $pol'")
}