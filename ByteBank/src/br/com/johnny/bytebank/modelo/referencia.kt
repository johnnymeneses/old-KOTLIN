package br.com.johnny.bytebank.modelo

import java.lang.Integer.parseInt
import java.lang.NumberFormatException

class referencia {
//    try as Expression
val entrada: String ="3"


//    try{
//        val valor: Double = entrada.toDouble()
//        println("Valor recebido $valor")
//    }catch (e: NumberFormatException){
//        println("Problem na conversão")
//        e.printStackTrace()
//    }

//    val a: Int? = try { parseInt("d")} catch (e: NumberFormatException) {null}

    val valorRecebido: Double? = try{
        entrada.toDouble()
    }catch (e: NumberFormatException){
        println("deu ruim")
        e.printStackTrace()
        null
    }
}