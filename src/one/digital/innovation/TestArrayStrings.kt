package one.digital.innovation

fun main() {
    val nomes = Array<String>(5) {"Luiz"}

    nomes[1] = "Leo"
    nomes[2] = "Ana"
    nomes[3] = "Joao"
    nomes[4] = "Lio"

    for( nome in nomes)
    {
        println(nome)
    }
    println("------------------")
    nomes.sort()
    nomes.forEach { println(it) }
    println("------------------")
    val nomes2 = arrayOf("ZAA","Zaza","Zizo")

    nomes2.forEach { println(it) }
    println("------------------")
    nomes2.sort()
    nomes2.forEach { println(it) }
}