package collections

class Objeto(val nome: String, val descricao: String) {
    override fun hashCode(): Int {
        return nome.length
    }

    override fun equals(other: Any?) = if (other is Objeto) {
        nome.equals(other.nome, ignoreCase = true)
    } else {
        false
    }
}


fun main(args: Array<String>) {
    val conjunto = hashSetOf(
            Objeto("Cadeira", "..."), // Hashcode = 7
            Objeto("Mesa", "..."), // Hashcode = 4
            Objeto("Faca", "..."), // Hashcode = 4
            Objeto("Copo", "...") // Hashcode = 4
    )

    conjunto.contains(Objeto("faca", "???")).print()
}