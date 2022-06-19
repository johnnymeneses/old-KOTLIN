package a_conceitos

fun operadorElvis() {

    var teste: Int? = null //O ponto de interrogação permite que a variavel seja nula

    //Operador Elvis trabalha com variaveis que podem ser nulas  :?

//    teste = 5

    val op: Int = teste
        ?: 100 //verifica se a variavel Teste está nula , se estiver... vai usar 100, se ão... vai usar o valor que estiver lá
    println(op)

}