package fundamentos.operadores

fun main(args: Array<String>) {
    var num1: Int = 1
    var num2: Int = 2

    num1++
    println(num1)
    --num1
    println(num1)

    // Incremento e decremento
    println(++num1 == num2--)
    println(num1 == num2)
}