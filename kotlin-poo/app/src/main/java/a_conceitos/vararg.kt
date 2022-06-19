package a_conceitos


fun vararg() {


    media(5f, 6f, 3f, 2f, 5f)
    media(10f, 10f, 8f, 2f, 5f)
    media2("oi",4,5,6,5f,true,'w')



}

//vararg aceita uma quantidade ilimitada de parametros
fun media(vararg notas: Float) {

    if (notas.isNotEmpty()) {
        var soma = 0f

        for (nota in notas) {
            soma += nota
        }
        println("A media é: ${soma / notas.size}")
    }
}


fun <T> media2(vararg valores: T){

    for (valor in valores){
        println(valor)
    }
}