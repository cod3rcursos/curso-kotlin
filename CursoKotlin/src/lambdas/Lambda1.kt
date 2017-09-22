package lambdas

fun main(args: Array<String>) {
    val soma = { x: Int, y: Int -> x + y }
    println(soma(4, 6))
}