package logica/*
Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o preço do litro da gasolina e o valor do pagamento,
 e exibir quantos litros ele conseguiu colocar no tanque. 
*/

fun main() = ex07(5.5f, 80.0f)


fun ex07(preco: Float, dinheiro: Float) {
    var litros = dinheiro / preco

    println("Com a gasolina custando R$$preco, você conseguira abastecer $litros litros com a quantia paga de R$ $dinheiro")


}
