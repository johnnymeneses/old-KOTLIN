package d_exercicios_logica/*
Faça um algoritmo que receba duas notas, calcule e mostre a média ponderada dessas notas, considerando peso 2 para a primeira nota e peso 3 para a segunda nota.
 */

fun mediaPonderada(nota1: Int, nota2: Int)
{
    val peso1: Int = 2
    val peso2: Int = 3

    var mp: Int
    var mpResultado: Double

    mp = ((nota1 * peso1) + (nota2 * peso2))

    mpResultado = mp.toDouble() / (peso1 + peso2)

    println(mpResultado)



}