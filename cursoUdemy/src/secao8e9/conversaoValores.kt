/**
Double  64
Float   32
Long    64
Int     32
short   16
Byte    8
 **/


fun conversaoValores() {

    val n1: Byte = 100
    teste(1 * n1)


    val n2: Double = Double.MAX_VALUE
    val b2: Byte = n2.toInt().toByte()

    println(n2)
    println(b2)

    //Do menor para o maior é mais tranquilo. Do maior para o menor pode ter problema de armazenamento
    //A conversão de dados precisa ser explicita

    val b1: Byte = 100

    println(b1)
    println("Long: ${b1.toLong()}")
    println("Float: ${b1.toFloat()}")
    println("Short: ${b1.toShort()}")
    println("Double: ${b1.toDouble()}")

    //Conversão de String em inteiro

    println("19".toInt())
    println("19".toFloat())
    println("19".toDouble())
//    println("33r".toInt()) //Essa conversão não funciona


}


fun teste(n1: Int) {

}