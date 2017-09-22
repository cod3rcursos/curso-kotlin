package lambdas

data class Casa(var endereco: String = "", var num: Int = 0)

fun main(args: Array<String>) {
    var casa = Casa()

    casa.run {
        endereco = "Rua ABC"
        num = 1544
    }

    println(casa)
}