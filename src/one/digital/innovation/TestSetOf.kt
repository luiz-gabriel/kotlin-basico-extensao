package one.digital.innovation

fun main()
{
    val joao = Funcionario("João",2000.0,"CLT")
    val pedro = Funcionario("Pedro",900.0,"PJ")
    val maria = Funcionario("Maria",3000.0,"PJ")

    val funcionarios = setOf(joao,pedro,maria)
    val funcionarioClt = setOf(joao)
    val funcionarioPj = setOf(pedro,maria)

    val resultUnion = funcionarioClt.union(funcionarioPj)

    resultUnion.forEach { println(it) }

    println("-------------------------")
    val resultSubtract = funcionarios.subtract(funcionarioPj)
    resultSubtract.forEach { println(it) }

    println("-------------------------")
    val resultIntersect = funcionarios.intersect(funcionarioPj)
    resultIntersect.forEach { println(it) }
}