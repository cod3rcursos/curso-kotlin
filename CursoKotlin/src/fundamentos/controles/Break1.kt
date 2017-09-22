package fundamentos.controles

fun main(args: Array<String>) {
    for (i in 1..10) {
        if(i == 5) {
            break
        }
        println("Atual: $i")
    }
    println("Fim!")
}