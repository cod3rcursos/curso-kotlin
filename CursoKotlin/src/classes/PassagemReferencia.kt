package classes

// Erro!! Kotlin: Val cannot be reassigned
//fun porReferencia(velociade: Int) {
//    velocidade++
//}

data class Carro(var marca: String, var modelo: String, var velocidade: Int = 0)

fun porReferencia(carro: Carro) {
    carro.velocidade++
}

fun main(args: Array<String>) {
    var carro1 = Carro("Ford", "Fusion")

    var carro2 = carro1
    carro2.modelo = "Edge"
    println(carro1)

    carro1 = Carro("Audi", "A4")

    porReferencia(carro1)
    porReferencia(carro2)

    println(carro1)
    println(carro2)

    var a = 1
    var b = a
    println(a === b)
    b++
    println(a === b)
    println(a)
    println(b)
}