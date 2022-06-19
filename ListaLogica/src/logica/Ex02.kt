package logica
/*
	A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as dimensões de um terreno e depois exibir a área do terreno.
    O cálculo da área neste caso é bem simples, basta multiplicar lado x comprimento para retângulos
* */

fun main() = println(ex02(5, 4))


fun ex02(a: Int, b: Int): String = "A area é de ${a * b}"
