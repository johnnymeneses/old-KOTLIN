package a_conceitos

fun nullSafe(){

    val str: String? = null //o ? indica que a variavel pode ser null
    println(str) // ok

    println(str?.length) // Null Safe com operador Elvis

//    Se for feita uma validação, não precisa do Elvis
    if (str != null) {
        println(str)
    }


//Assumindo o risco do NullPointer Exception !!
    println(str!!.length)

}


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