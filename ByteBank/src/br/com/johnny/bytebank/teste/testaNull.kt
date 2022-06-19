package br.com.johnny.bytebank.teste

import br.com.johnny.bytebank.modelo.Endereco


//NullPointerExcpetion - The Billion Dolar Mistake

fun testaNull(){
    safeCall()
}

fun safeCall(){
    val a = "Kotlin"
    val b: String? = null

    println(b?.length) //null
    println(a?.length) //6
}

/*
*    //? Objeto pode ser nulo (Nullable)
    var endereco : Endereco ? = null

    //!! Não podem ser nulos (Non Null Types)
    endereco!!.logradouro

* */