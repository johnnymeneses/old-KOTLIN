package d_exercicios_logica/*
Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua média ponderada (as notas tem pesos respectivos de 1, 2 e 3). 
*/


fun ex10(nota1: Int, nota2: Int, nota3: Int) {
    var media = ((nota1 * 1 + nota2 * 2 + nota3 * 3).toDouble()) / (1 + 2 + 3)
    println("Media: $media")
}