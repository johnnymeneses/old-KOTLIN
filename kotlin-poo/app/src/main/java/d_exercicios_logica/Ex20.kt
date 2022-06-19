package d_exercicios_logica/*
A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra.
Faça um algoritmo para calcular e imprimir o salário bruto e o salário líquido de um determinado funcionário.
Considere que o salário líquido é igual ao salário bruto descontando-se 10% de impostos.
 */


fun Ex20(qtdehoraNormal: Int, qtdehoraExtra: Int){

    val valorHoraNormal = 10
    val valorHoraExtra = 10

    val salarioBruto = (qtdehoraNormal*valorHoraNormal)+(qtdehoraExtra*valorHoraExtra)
    val imposto = 0.1
    val salarioLiquido = salarioBruto - (salarioBruto*imposto)

    println("Horas Trabalhadas: $qtdehoraNormal | Horas Extras: $qtdehoraExtra | Valor à receber  R$ $salarioLiquido ja descontando ${salarioBruto-salarioLiquido} de imposto")

}