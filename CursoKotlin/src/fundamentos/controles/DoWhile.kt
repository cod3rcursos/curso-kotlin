package fundamentos.controles

fun main(args: Array<String>) {
    var opcao: Int = -1

    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu a opção $opcao")
    } while(opcao != -1)

    println("Até a próxima!")
}