package d_exercicios_logica

import a_conceitos.saldo


//FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
//Quando o número for divisível por 3, imprimir Buzz
//Quando o número for divisível por 5, imprimir Fizz
//Quando o número for divisível por 3 e 5 , imprimir FizzBuzz


fun Ex46() {

    for (index in 1..50) {
        when {
                index % 3 ==0 && index % 5 ==0  -> println("FizzBuzz")
                index % 3 ==0  -> println("Buzz")
                index % 5 ==0  -> println("Fizz")
                index % 3 !=0  -> println(index)
                index % 5 !=0  -> println(index)
            }
    }

}