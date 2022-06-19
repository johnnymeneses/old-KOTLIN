package b_estruturaDados

fun testeArray(){

    val idades = IntArray(5) // Array com tamanho definido
    idades[0] = 25
    idades[1] = 35
    idades[2] = 45
    idades[3] = 15
    idades[4] = 55

//Percorrendo o array
    var maiorIdade=0

    for(idade in idades)
    {
        if(idade > maiorIdade){
            maiorIdade = idade
        }

    }
    println("Array normal - Maior idade $maiorIdade")


    val idadesDinamico = intArrayOf(25,35,45,12,55,70,81)//Array com tamanhho dinâmico

    //Percorrendo o array
    var maiorIdadeD=0

    for(idade in idadesDinamico)
    {
        if(idade > maiorIdadeD){
            maiorIdadeD = idade
        }

    }

    println("Array Dinâmico - Maior idade $maiorIdadeD")


    //Versão com forEach

    var menorIdade= Int.MAX_VALUE //Garante o maior valor possível do inteiro (melhor que ficar colocando 99)

    idadesDinamico.forEach {  idadesDinamico ->
        if(idadesDinamico < menorIdade){
            menorIdade = idadesDinamico
        }
    }
    println("Menor idade no forEach $menorIdade ")


}



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