package logica/*
Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início do ano. Esqueça a questão dos anos bissextos e considere sempre que um mês possui 30 dias.
*/

fun main() = ex09(41, 12)


fun ex09(dia: Int, mes: Int) {

    var total = ((mes - 1) * 30) + dia

    println("Já se passaram $total dias")
}

