package collections

fun main(args: Array<String>) {
    var map = HashMap<Long, String>()

    map.put(10020030040, "João")
    map.put(30040050060, "Maria")
    map.put(60070080090, "Pedro")

    map.put(60070080090, "Pedro Filho")

    for (par in map) {
        println(par)
    }

    for (nome in map.values) {
        println(nome)
    }

    for (cpf in map.keys) {
        println(cpf)
    }

    for ((cpf, nome) in map) {
        println("$nome (CPF: $cpf)")
    }

    map.size.print()
    map.get(30040050060)?.print()
    map[30040050060]?.print()
    map.contains(30040050060).print()
    map.remove(30040050060)?.print()
    map.clear()
    map.isEmpty().print()
}