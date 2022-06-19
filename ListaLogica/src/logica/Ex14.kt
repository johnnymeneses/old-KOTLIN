package logica

//Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%.
//Após o aumento, desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.


fun main() = ex14(6000.0)

    fun ex14(salario: Double){
        var sal = salario+(salario*0.15)
        var salReal = sal-(sal*0.08)
        println("Salario Inicial $salario")
        println("Salario com aumento de 15% $sal")
        println("Salario novo com desconto de 8% $salReal")

    }
