package one.digital.innovation

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1650".toBigDecimal(),
        "1700".toBigDecimal()
    )

    println(salarios.somatoria())
    println("-----------------------------")
    println(salarios.media())
}