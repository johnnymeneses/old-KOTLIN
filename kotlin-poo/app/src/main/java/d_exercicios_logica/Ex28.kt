package d_exercicios_logica/*
Faça um algoritmo que receba dois números, calcule e mostre a divisão do primeiro número pelo segundo.
Sabe-se que o segundo número não pode ser zero, portanto não é necessário se preocupar com validações

*/

fun divisao(num1: Int, num2: Int){

    if((num1 ==0) || (num2==0)){
        println("Número inválido informado")
        return
    }


    var total: Double
    total= num1.toDouble() / num2.toDouble()

    println("Divisao de $num1 por $num2 = $total")


}