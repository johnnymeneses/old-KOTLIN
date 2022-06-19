package d_exercicios_logica

//Escreva um programa capaz de receber um número inteiro N e imprimir uma escada do tamanho N usando o caracter #
//
//Se a entrada for de 4, teremos
//
//#
//##
//###
//####


fun Ex44(num: Int) {

    for (index in 1..num) {
        for (index in 1..index) {
            print("#")
        }
        println("")


    }


}