package logica
/*
Tabuada
* */

fun main() = ex01(10)


fun ex01(num: Int) {
    for (index in 1..10) {
        println("$index * $num = " + index * num)
    }
}
