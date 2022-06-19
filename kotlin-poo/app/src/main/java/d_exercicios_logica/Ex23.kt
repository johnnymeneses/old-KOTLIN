package d_exercicios_logica/*

A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos:
 lata de 350 ml
 garrafa de 600 ml
 garrafa de 2 litros.

 Se um comerciante compra uma determinada quantidade de cada formato,
  faça um algoritmo para calcular quantos litros de refrigerante ele comprou.

*/



fun Ex23(lata: Int, garrafa: Int, garrafao: Int){

    var total = (lata*0.35)+(garrafa*0.6)+(garrafao*2)
    println("$total litros")
}
