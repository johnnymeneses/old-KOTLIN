package d_exercicios_logica

//Considere uma caixa d'agua de 2 mil litros. Romulo fostaria de encher a caixa com balões
//de água de 7 litros. Quantos baloes cabem na caixa d'agua até que o volume seja excedido

fun Ex45() {

    var i = 0
    var balao = 0

        do {
            i+=7
            balao++
        } while (i <= 2000)


    println("Baloes: ${balao}")


}