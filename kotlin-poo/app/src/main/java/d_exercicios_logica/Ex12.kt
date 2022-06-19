package d_exercicios_logica/*
Escrever uma mídia que recebendo um número e retorna quais são os divisores desse número.
Em uma segunda versão, avisar se a logica.logica.soma dos divisores e a mesma do número informado.  Ex 28
Terceira versão: dado um range, exibir quais números tem a logica.logica.soma de seus divisores exatamente igual a mumero informado
* */

fun numerosAmigos(num1: Int, num2: Int) {
    var soma1: Int = 0
    var soma2: Int = 0

    for (index in 1..num1) {
        if (num1 % index == 0) soma1 += index
    }

    for (indice in 1..num2) {
        if (num2 % indice == 0) soma2 += indice
    }

    if (((soma1 - num1) == num2) && ((soma2 - num2) == num1))
    {
        println("Numeros Amigos")
    }else
    {
        println("Numeros Comuns")
    }

}






//        for(index in 1..num1) {
//            if (num1 % index == 0) soma1 += index
//        }
//        println("Soma dos divisores de $num1 : " + (soma1 - num1))



fun restoDivisao(num: Int){
    var soma: Int = 0

    for(index in 1..num)
    {
        if(num % index  == 0) {
            println(index)
            soma+=index
        }

    }

    println("Soma dos divisores de $num : " + (soma - num))



//        fun parImpar(num: Int): String = if (num % 2 == 0) "$num é Par" else "$num é Impar"

}