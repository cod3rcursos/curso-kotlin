package classes

enum class DiaSemana2 (val id: Int, val nome: String, val util: Boolean) {
    DOMINGO(1, "Domingo", false),
    SEGUNDA(2, "Segunda", true),
    TERCA(3, "Terça", true),
    QUARTA(4, "Quarta", true),
    QUINTA(5, "Quinta", true),
    SEXTA(6, "Sexta", true),
    SABADO(7, "Sábado", false)
}

fun main(args: Array<String>) {
    for (dia in DiaSemana2.values()) {
        println("${dia.nome} é um dia ${if(dia.util) "útil" else "do fim de semana"}.")
    }
}