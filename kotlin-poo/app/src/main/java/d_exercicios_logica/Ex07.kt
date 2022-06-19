package d_exercicios_logica/*
Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o preço do litro da gasolina e o valor do pagamento,
 e exibir quantos litros ele conseguiu colocar no tanque. 
*/


fun Ex07(preco: Float, pagamento: Float) : String = "Voce conseguiu abastecer ${pagamento/preco} litros com R$ $pagamento. O preço atual da gasolina é R$ $preco"