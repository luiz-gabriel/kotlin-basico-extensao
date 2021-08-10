package one.digital.innovation

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    for(i in values){
        println(i)
    }
    println("---------------------------------------------\n")
    values.forEach {
        println(it)
    }
    println("---------------------------------------------\n")
    for(index in values.indices)
    {
        println(values[index])
    }
    println("---------------------------------------------\n")
    values.sort()

    for(valor in values)
    {
        println(valor)
    }


}
