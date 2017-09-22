package avancado

fun fatorial(num: Int): Int = when(num) {
    in 0..1 -> 1
    in 2..Int.MAX_VALUE -> num * fatorial(num - 1)
    else -> throw IllegalArgumentException("Número negativo")
}

fun main(args: Array<String>) {
    println("Resultado: ${fatorial(5)}")
}