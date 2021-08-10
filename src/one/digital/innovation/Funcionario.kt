package one.digital.innovation

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContrato: String
){
    override fun toString(): String = """
        |Nome: $nome
        |Salario: $salario
        |Tipo de contrato: $tipoContrato
        |""".trimMargin()
}