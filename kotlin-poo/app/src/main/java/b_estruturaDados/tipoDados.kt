package b_estruturaDados

import java.math.BigDecimal
import java.math.BigInteger

// Tipo de Dados

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
//    /teste(1 * n1)

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


fun maxMinValue(){

    println("Char MAX VALUE: ${Char.MAX_VALUE}")
    println("Char MIN VALUE: ${Char.MIN_VALUE}")
    println("")
    println("")
    println("Int MAX VALUE: ${Int.MAX_VALUE}")
    println("Int MIN VALUE: ${Int.MIN_VALUE}")
    println("")
    println("Long MAX VALUE: ${Long.MAX_VALUE}")
    println("Long MIN VALUE: ${Long.MIN_VALUE}")
    println("")
    println("Short MAX VALUE: ${Short.MAX_VALUE}")
    println("Short MIN VALUE: ${Short.MIN_VALUE}")
    println("")
    println("Double MAX VALUE: ${Double.MAX_VALUE}")
    println("Double MIN VALUE: ${Double.MIN_VALUE}")
    println("")
    println("Byte MAX VALUE: ${Byte.MAX_VALUE}")
    println("Byte MIN VALUE: ${Byte.MIN_VALUE}")

}


fun main(){
    //    conversaoValores()
    maxMinValue()

}