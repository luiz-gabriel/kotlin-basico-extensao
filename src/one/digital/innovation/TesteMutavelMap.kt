package one.digital.innovation

fun main() {
    val joao = Funcionario("João",2000.0,"CLT")
    val pedro = Funcionario("Pedro",900.0,"PJ")
    val maria = Funcionario("Maria",3000.0,"PJ")

    val repo = Repositorio<Funcionario>()

    repo.create(joao.nome, joao)
    repo.create(maria.nome, maria)
    repo.create(pedro.nome, pedro)

    //println(repo.findById(joao.nome))
    println(repo.getAll())
    println("----------------")

    repo.remove(maria.nome)
    repo.findAll().forEach{ println(it) }
}