package d_exercicios_logica/*
Uma confecção produz X blusas de lã e para isto gasta uma certa quantidade de novelos. Faça um algoritmo para calcular quantos novelos de lã ela gasta por blusa
*Uma blusa de lã precisa de 87 novelos
 */



fun novelos(blusa: Int){

    when {
        blusa <= 0 -> return
        blusa == 1 -> println("Para $blusa blusa, é preciso ${blusa*87} novelos")
        blusa > 1 -> println("Para $blusa blusas, é preciso ${blusa*87} novelos")
    }

}