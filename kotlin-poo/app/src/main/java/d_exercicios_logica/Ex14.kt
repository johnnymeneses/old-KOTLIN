package d_exercicios_logica

//Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%.
//Após o aumento, desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.

fun Ex14(salario: Double){

    val valorimposto = 0.08
    val valorAumento = 0.15

    var sal = salario+(salario*valorAumento)
    var salReal = sal-(sal*valorimposto)

    println("Salario Inicial $salario")
    println("Salario com aumento de 15% $sal")
    println("Salario novo com desconto de 8% $salReal")

}
