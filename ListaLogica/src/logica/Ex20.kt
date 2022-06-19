package logica/*
A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra.
Faça um algoritmo para calcular e imprimir o salário bruto e o salário líquido de um determinado funcionário.
Considere que o salário líquido é igual ao salário bruto descontando-se 10% de impostos.
 */

fun main() = ex20(10,0)


fun ex20(horaNormal: Int, horaExtra: Int){

        val valorHoraNormal = 10
        val valorHoraExtra = 10

        val salarioBruto = (horaNormal*valorHoraNormal)+(horaExtra*valorHoraExtra)
        val imposto = 0.1
        val salarioLiquido = salarioBruto - (salarioBruto*imposto)

        println("Horas Trabalhadas: $horaNormal | Horas Extras: $horaExtra | Valor à receber  R$ $salarioLiquido ja descontando ${salarioBruto-salarioLiquido} de imposto")

}


