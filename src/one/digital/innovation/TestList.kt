package one.digital.innovation


fun main()
{
    val joao = Funcionario("João",2000.0,"CLT")
    val pedro = Funcionario("Pedro",900.0,"PJ")
    val maria = Funcionario("Maria",3000.0,"PJ")

    val funcionarios = listOf(joao,pedro,maria)

    funcionarios.forEach{println(it)}

    println("-------------------")
    println(funcionarios.find{it.nome == "Maria"})

    println("-------------------")
    funcionarios.sortedBy {
        it.salario
    }.forEach {
        println(it)
    }

    println("-------------------")
    funcionarios.groupBy {
        it.tipoContrato
    }.forEach {
        println(it)
    }
}




