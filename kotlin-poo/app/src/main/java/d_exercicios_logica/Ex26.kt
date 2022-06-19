package d_exercicios_logica/*
Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de suco de maracujá.
Faça um algoritmo para calcular quantos litros de água e de suco são necessários para se fazer X litros de refresco (informados pelo usuário).
 */

//    0.8 Agua mineral
//    0.2 Suco de Maracuja

fun sucoMaracuja(litro: Int){
    val agua = (litro * 0.8)
    val suco = (litro * 0.2)

    println("É preciso $agua litros de agua mineral e $suco litros de suco de maracujá para fazer $litro litros de refresco")

}