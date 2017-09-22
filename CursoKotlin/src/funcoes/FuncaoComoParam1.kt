package funcoes

class Operacoes {
    fun somar(a: Int, b: Int): Int {
        return a + b
    }
}

fun somar(a: Int, b: Int): Int {
    return a + b
}

fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int) : Int {
    return funcao(a, b)
}

fun main(args: Array<String>) {
    println(calc(2, 3, Operacoes()::somar))
    println(calc(2, 3, ::somar))
}