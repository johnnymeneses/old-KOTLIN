package a_conceitos


val saldo = 0.0

fun saldo2() {
    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 -> println("Conta zerada")
        else -> println("Conta negativa")
    }
}

fun forLoop() {
    val items = listOf("banana", "laranja", "kiwi")
    for (item in items) {
        println(item)
    }
}

fun flowFor() {

    val str = "Johnny"
    for (c in str) {
        print("$c ")
    }

    println("")
    for (i in 1..10) {
        print(i)
    }

    println("")
    for (i in 1..10 step 2) {
        print(i)
    }

    println("")
    for (i in 0..10) {
        if (i != 8) { //Não vai imprimir o 8
            print("$i")
        }
    }

    println("")
    for (i in 10 downTo 0) {
        print("$i ")
    }


}

fun listOf() {

    val items = listOf("apple", "banana", "maçã")
    for (index in items.indices) {
        println("Item at $index is ${items[index]}")
    }
}

fun whileLoop() {

    val itens3 = listOf("Fruta1", "Fruta2", "Fruta3")
    var index = 0

    while (index < itens3.size) {
        println("item as $index is ${itens3[index]}")
        index++
    }
}


fun tabuada() {
    val num = 5
    for (i in 1..10) {
        println("$i x $num = " + num * i)
    }
}


fun doLooping() {
    var i = 1

    do {
        val titular: String = "Johnny $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0
        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
        i++
    } while (i < 5)
}

fun forLooping() {
    for (i in 1..5) {
        if (i == 4) {
            break
        }
        val titular: String = "Johnny $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo: $saldo")
        println()

    }
}

fun main() {

    breakE()

    continueE()

}

fun breakE(){
    //break
    var i = 0
    while (i < 100) {
        if (i == 15) {
            break
        }
        i++
        print(i)

    }
}

fun continueE(){

    var i =0

    while(i<80){

        if(i<50){
            i++
            continue
        }
        print("$i ")
        i++

    }




}

