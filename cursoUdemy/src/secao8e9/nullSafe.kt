fun nullSafe(){

    val str: String? = null //o ? indica que a variavel pode ser null
    println(str) // ok

    println(str?.length) // Null Safe com operador Elvis

//    Se for feita uma validação, não precisa do Elvis
if (str != null) {
    println(str)
}


    //Assumindo o risco do NullPointer Exception !!
//    println(str!!.length)

}