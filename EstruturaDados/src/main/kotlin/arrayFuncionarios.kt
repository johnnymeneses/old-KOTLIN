
fun arrayFuncionarios(){


    //Array pontoFLutuante
    val salarios: DoubleArray = doubleArrayOf(1000.0,2000.0,3000.0,4000.0,5000.0)


//    Menor Salario
    var menorSalario = Double.MAX_VALUE //Garantir maior valor

    salarios.forEach { salarios ->
        if(salarios < menorSalario){
            menorSalario = salarios
        }
    }
    println("Menor Salario R$ $menorSalario")


//Maior Salario
    var maiorSalario = Double.MIN_VALUE //Garantir menor valor

    salarios.forEach { salarios ->
        if(salarios > maiorSalario){
            maiorSalario = salarios
        }
    }
    println("Maior Salario $maiorSalario")


    //Aumento de Salario - Versão For
    val aumentoSalario = 1.1

    for (indice in salarios.indices){
        salarios[indice] = salarios[indice]*aumentoSalario
    }
    println(salarios.contentToString())

    //Aumento de Salario - Versão ForEachIndexed (função que recebe como parâmetro outra função)
    salarios.forEachIndexed { i, bonus ->
        salarios[i] = bonus * aumentoSalario
    }
    println(salarios.contentToString())
}