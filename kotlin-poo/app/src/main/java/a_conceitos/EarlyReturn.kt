package a_conceitos

/*
# Early Return Statement

Beleza, agora vamos falar de complexidade de código: tá ligado aquele código que tem um monte de if/else um dentro do outro parecendo um hadouken?
 Então, isso ai é um PORRE pra gente que vai dar manutenção no futuro e muitas vezes perdemos uns minutos refatorando o negócio.
 Então, se ensinarmos a rapaziada como não criar esse tipo de código vai ser a maior vitória pros devs que mexem com legado (eu incluso).


Acho que nesse exemplo deu pra entender o conceito de hadouken, né?
Encadeamos tantos ifs e elses que não fez o menor sentido e só aumentou a
complexidade do código. Agora, se entendermos a lógica do **Early Return** a coisa fica um pouco mais bonita.

O que é: fazer com que o else seja sempre a condição principal e dar o
retorno da função o quanto antes. Ou seja: negar a função e retornar em
caso de erro. Não entendeu? Vamos pra prática então:

 */

fun main(){
    earlyReturn()
}

fun earlyReturn(){
    val saldo = 5.0
    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 -> println("Conta zerada")
        else -> println("Conta negativa")
    }
}