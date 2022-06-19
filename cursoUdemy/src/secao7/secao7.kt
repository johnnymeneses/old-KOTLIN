fun secao7() {
    println("Seção 7 - Controle de FLuxo")
    println("")

    flowWhile1()







//    operadorElvis()
//    flowWhen()
//    flowFor()
//    tabuada(5)
//    flowWhile()
//    flowDoWhile()




}


fun operadorElvis() {

    var teste: Int? = null //O ponto de interrogação permite que a variavel seja nula

    //Operador Elvis trabalha com variaveis que podem ser nulas  :?

//    teste = 5

    val op: Int = teste
        ?: 100 //verifica se a variavel Teste está nula , se estiver... vai usar 100, se ão... vai usar o valor que estiver lá
    println(op)

}

//When
fun flowWhen() {

    println(operacao(10, 10, "Soma"))
    println(operacao(10, 0, "Subtração"))
}
fun operacao(a: Int, b: Int, c: String): Int {

//    when (c) {
//        "Soma" -> return a + b
//        "Subtração" -> return a - b
//        else -> return 0
//    }

    //When precisa de um valor default caso o valor buscado não seja encontrado
    when {
        a > 0 && b >0 -> return 1
        else -> return 0
    }


}

//For (loop)
fun flowFor(){

    val str = "Johnny"
    for(c in str){
        print("$c ")
    }

    println("")
    for (i in 1..10){
        print(i)
    }

    println("")
    for (i in 1..10 step 2){
        print(i)
    }

    println("")
    for(i in 0..10){
        if(i !=8) { //Não vai imprimir o 8
            print("$i")
        }
    }

    println("")
    for (i in 10 downTo 0){
        print("$i ")
    }



}

//For Tabuada
fun tabuada(num: Int) {
    for (index in 1..10) {
        println("$index * $num = " + index * num)
    }
}









//Do While
fun flowDoWhile(){

    var index = 10
    do{
        println(index)
        index--
    }while(index >=0)

    println("")

    var index2 = 10
    do{
        println(index2)
        index2--

        if(index2 ==3){
            break
        }
    }while(index2 >=0)


}


