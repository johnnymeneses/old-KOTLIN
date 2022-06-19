package b_estruturaDados

fun range() {
    println("Range")
    Ex6()

}
fun Ex1(){

//Impressão de range
    val serie : IntRange = 1.rangeTo(10)

    for (s in serie){
        print("$s ")
    }
}

fun Ex2(){
    //range de números pares
    println("Numeros Pares")
    val numerosPares = 0..50 step 2
    for (par in numerosPares)
    {
        print(" $par : ")
    }
}
fun Ex3() {
//    range dos numeros pares, exceto o ultimo

    val numerosPares2 = 0.until(50) step 2
    for (par in numerosPares2) {
        print(" $par : ")
    }
}



fun Ex4(){
    //Numeros pares reverso
    println("")
    val numerosParesReverso = 50 downTo 0 step 2
    numerosParesReverso.forEach {print(" $it :")}
}


fun Ex5(){

    //Encontrando valores dentro de um range
    val intervalo = 100.0..500.0
    val salario= 12250.0

    if(salario in intervalo)
    {
        println("Salario encontrado")
    }else {
        println("Salario não encontrado")
    }


    //Encontrando letras
    val alfabeto = 'a'..'z' //Letras minusculas
    //val letra = 'k'
    val letra = 'K'
    if(letra in alfabeto){
        println("Letra encontrada")
    }else{
        println("Letra não encontrada")
    }
}




fun Ex6 (){
    val idades: IntArray = intArrayOf(18, 12, 29, 35, 64, 78)

    //println(idades.contentToString())
    //Encontrando valor maximo
    val maiorIdade = idades.maxOrNull()

    //Encontrando valor mínimo
    val menorIdade = idades.minOrNull()

    //idade Media
    val idadeMedia = idades.average()


    //Toodos são maiores de idade ?
    val todosMaiores = idades.all {it >= 18} //all retorna quando todos satisfazem a condição

//    Alguem maior de idade
    val alguemMaior = idades.any {it >=18} //any retorna quando pelo menos um satifaz a condição

    //Filtrar somente quem é maior de idade
    val soMaiores = idades.filter { it >=18 }

    //Filtrar somente quem é menor de idade
    val soMenores = idades.filter { it <18 }

    //Procura alguem com valor especifico
    val valorEspecifico = idades.find { it==18 } //traz o primeiro valor que satisfaça

    println("Menor idade :$menorIdade")
    println("Maior idade :$maiorIdade")
    println("Idade media :$idadeMedia")
    println("Todos maiores de idade? :$todosMaiores")
    println("Alguem maior de idade? :$alguemMaior")
    println("Lista de Maiores :$soMaiores")
    println("Lista de Menores :$soMenores")
    println("Alguem especifico? :$valorEspecifico")

}
