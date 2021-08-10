package one.digital.innovation

fun main() {
    val joao = Funcionario("João",2000.0,"CLT")
    val pedro = Funcionario("Pedro",900.0,"PJ")
    val maria = Funcionario("Maria",3000.0,"PJ")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("----------------")

    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("----------------")

    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("----------------")

    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("----------------")
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("----------------")
    funcionariosSet.remove(joao)
    funcionariosSet.forEach { println(it) }
}