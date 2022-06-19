package d_exercicios_logica

fun declaraVariavel(){

//    Variável com valor imutável
    val nome = "Johnny"
//    Variável com valor que pode ser modificado
    var nome1 = "Johnny"


}

//Função com retorno - Opção 1
//[chamada] println(logica.logica.soma(5,6))
fun soma(a: Int, b: Int): Int {
    return a+b
}

//Função com retorno - Opção 2
//[chamada] println(logica.logica.soma2(5,44))
fun soma2(a: Int, b: Int): Int = a+b

//Função sem retorno
fun max (a: Int, b:Int){
    var soma = a+b
}


fun condicional(): Boolean{

    var senha: Int=1
    var senhaCorreta: Int=1

//    1 opção de IF
    return senha == senhaCorreta

//    2 Opção IF
    if(senha == senhaCorreta) {
        return true
    }else {}
        return false
}


//When no lugar do IF
fun ifWhen()
{
    var saldo: Double = 0.0

    if (saldo > 0.0) {
        println("Saldo positivo")
    } else if (saldo == 0.0) {
        println("Conta zerada")

        when {
            saldo > 0.0 -> println("Saldo positivo")
            saldo == 0.0 -> println("Conta zerada")
            else -> println("Conta negativa")
        }

    }
}

fun loopWhen(){
    var saldo: Double = 0.0

    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 -> println("Conta zerada")
        else -> println("Conta negativa")
    }

fun loopFor(){
//    Opção 1
    val items = listOf("banana", "laranja", "kiwi")

    for (item in items) {
        println(item)
    }

    val items2 = listOf("apple", "banana", "maçã")
    for (index in items2.indices) {
        println("Item at $index is ${items[index]}")
    }


}

fun loopWhile(){
    val itens3 = listOf("Fruta1", "Fruta2", "Fruta3")
    var index = 0

    while (index < itens3.size) {
        println("item as $index is ${itens3[index]}")
        index++
    }

}

    fun exemploLoopins(){
        var i: Int = 1
        for (index in 1..1000)
        {
            println(index)
        }

        do {
            println(i)
            i++
        }while(i<=1000)


        while (i<=1000)
        {  println(i)
            i++
        }



    }

fun jetAcademy(){
    //JetBrain Academy

//    var x: Double = 0.0
//        x = readLine()?.toDouble() ?:
//        x.toDouble()
//        println(x)


//    val spell = "abra"
//    println((spell + "cad").repeat(spell.length) + spell)


//val month = "August"
//    val day = 22
//    val year = 2019
//
//    println("$month $day, $year")


}


}