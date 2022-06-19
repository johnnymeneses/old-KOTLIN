package d_exercicios_logica
/*
Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida respectivamente por 10, 12 e 15 reais. 
Construa um algoritmo em que o usuário forneça a quantidade de camisetas pequenas,
médias e grandes referentes a uma venda, e a máquina informe quanto será o valor arrecadado.

*/


fun ex11(p: Int, m: Int, g: Int) {
    val pPreco = 10
    val mPreco = 12
    val gPreco = 15

    var total = 0


    if (p > 0) total += pPreco * p

    if (m > 0) total += mPreco * m

    if (g > 0) total += gPreco * g

    println("O valor das vendas foi de R$ $total ")

}