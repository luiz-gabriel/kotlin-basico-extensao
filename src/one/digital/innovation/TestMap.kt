package one.digital.innovation

fun main() {
    val pair: Pair<String, Double> = Pair( "Luiz", 1000.0)
    //val pair = Pair<String, Double> = Pair("Joao",1000.0)
    val mapl = mapOf(pair)
    mapl.forEach { k, v-> println("Chave: $k \nValor:$v")}
    println("--------------------------")
    var map2 = mapOf(
        "Liz" to 2500.0,
        "Eru" to 500.0
    )

    map2.forEach { k, v-> println("Chave: $k \nValor:$v")}
}