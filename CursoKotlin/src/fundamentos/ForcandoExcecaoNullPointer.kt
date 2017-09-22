package fundamentos

fun main(args: Array<String>) {
    var a: Int? = null
    println(a?.inc())

    println("Momento do erro...")
    println(a!!.inc())
}