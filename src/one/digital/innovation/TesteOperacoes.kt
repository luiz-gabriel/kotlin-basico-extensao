package one.digital.innovation

fun main() {
    val salarios = doubleArrayOf(1000.0,5000.0,2000.0,3000.0)

    for (salario in salarios) {println(salario)}

    println("-------------------------------")

    println("Maior salario Maria: ${salarios.maxOrNull()}")
    println("Menor salario Joao: ${salarios.minOrNull()}")
    println("Média salarial Luana: ${salarios.average()}")


    println("--------------------------------")

    val salario = salarios.filter { it > 1000.0 }

    salario.forEach{ println(it) }

    println("--------------------------------")
    println(salarios.count {it in 2000.0..4000.0})

    println("--------------------------------")
    println(salarios.find{it == 5000.0})

    println("--------------------------------")
    println(salarios.any{it == 2000.0})
}