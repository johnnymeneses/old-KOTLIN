package g_collections

data class Receita(val nome: String, val calorias: Int, val ingredientes: List<Ingredientes> = listOf())
data class Ingredientes(val nome: String, val quantidade: Int)

fun oldCollection() {

    // Cria lista de dados
    val data = listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingredientes("Farinha", 1),
                Ingredientes("Presunto", 5),
                Ingredientes("Queijo", 10),
                Ingredientes("Molho de tomate", 2),
                Ingredientes("Manjerição", 3)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingredientes("Pão", 1),
                Ingredientes("Hamburguer", 3),
                Ingredientes("Queijo", 1),
                Ingredientes("Catupiry", 1),
                Ingredientes("Bacon", 3),
                Ingredientes("Alface", 1),
                Ingredientes("Tomate", 1)
            )
        )
    )

    // Tenho receitas na lista?
    println("Tenho receitas? ${if (data.any()) "sim" else "não"}.")

    // Quantas receitas tenho na coleção?
    println("Tenho ${data.count()} receitas.")

    // Qual a primeira e última receita?
    println("A primeira receita é: ${data.first().nome}.")
    println("A última receita é: ${data.last().nome}.")



    // Tenho alguma receita de Lasanha?
    println("Tenho receitas de Lasanha? ${if (data.any { it.nome.contains("Lasanha") }) "sim" else "não"}.")

    // Quantas receitas de Lasanha?
    println("Tenho ${data.count { it.nome.contains("Lasanha") }} receitas de Lasanha.")



    // Qual a soma de calorias?
    val sumCalories = data.sumBy { it.calorias }

    println("A soma de calorias é: $sumCalories")

    // Me dê as duas primeiras receitas
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.nome}")
    }

    // Sei como fazer panqueca? E sushi?
    val knowPanqueke = data.filter { it.nome == "Panqueca" }.any()
    println("Sei fazer panqueca? ${if (knowPanqueke) "sim" else "não"}")

    val knowSushi = data.filter { it.nome == "Sushi" }.any()
    println("Sei fazer sushi? ${if (knowSushi) "sim" else "não"}")

    // Quais são as comidas com mais de 500 calorias?
    data.filter { it.calorias > 500 }.forEach { println(it.nome) }

    // Qual a receita mais calórica? E a menos calórica?
//    val maisCal = data.maxBy { it.calorias }
//    println("Mais calórica: ${maisCal?.nome}")

//    val menosCal = data.minBy { it.calorias }
//    println("Menos calórica: ${menosCal?.nome}")

    // Faça uma lista com o nome dos pratos
    data.map { it.nome }

    // Qual a média de calor de todas as receitas?
    val media = data.map { it.calorias }.average()
    println("A média de calorias é: $media.")

//    // Lista de dados simples
//    val listaInteiros = listOf(1, 2, 6, 67, 7, 3, 34, 56, 3, 3, 2, 5, 34, 2)
//    println("Lista distinta: ${listaInteiros.distinct()}.")
//    println("Máximo: ${listaInteiros.max()}.")
//    println("Mínimo: ${listaInteiros.min()}.")

    // Eliminar receitas com mesmo nome
    println(data.distinctBy { it.nome })

//    // Ordenar uma lista
//    listaInteiros.sorted()
//    listaInteiros.sortedDescending()
//
//    // Inverter uma lista
//    listaInteiros.reversed()

}






fun colecao1(args: Array<String>) {

//     List - array, Set, HashMap

    val l1 = listOf("Madrid", "São Paulo", "Berlim") //listOf é imutável - adiciona list repetidos
    val l2 = mutableListOf("Madrid", "São Paulo", "Berlim") //mutableListOf é mutável
    val a1 = arrayListOf("Madrid", "São Paulo", "Berlim")
    val s1 = setOf(
        "Madrid",
        "São Paulo",
        "Berlim",
        "Berlim"
    ) //Set pra ListOF - O Set nao adiciona list repetidos (nao permite alteração)
    val s2 =
        mutableSetOf("Madrid", "São Paulo", "Berlim", "Berlim") //Set pra ListOF - O Set nao adiciona list repetidos

    //HashMap possui uma chave e um valor
    val h1 = hashMapOf<String, String>(Pair("key", "value"), Pair("França", "Paris"))

    println(h1.entries)


    println(l2.size)
    l2.add("Santos")
    println(l2.size)

//        println(s1.size)


}


/// BootCamp
//1 - Collections, Arrays, List, Set, MAP
//2 - MutableList, MutabçeMap, MutableSet,MutableIterable e Mutablecollection
//3 - Extension Functions


fun main(){
    println("Collections no Bootcamp")
}

