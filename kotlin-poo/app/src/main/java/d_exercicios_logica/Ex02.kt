package d_exercicios_logica
/*
	A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as dimensões de um terreno e depois exibir a área do terreno.
    O cálculo da área neste caso é bem simples, basta multiplicar lado x comprimento para retângulos
* */

//fun main() = println(Ex02(5, 4))
//fun logica.main() = Ex02a(5, 4)


fun Ex02a(a: Int, b: Int): String = "A área do terreno é ${+a * b}"

fun Ex02(a: Int, b: Int) {
    println("A área do terreno é ${+a * b}")
}
