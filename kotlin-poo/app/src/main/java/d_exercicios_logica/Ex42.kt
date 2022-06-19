package d_exercicios_logica

//Usando a resolução do exercicio 1, nao imprima os numeros múltiplos de 5


fun Ex42() {

    for (index in 1..50) {

        if (index % 5 != 0) { //ignorar os multiplos de 5
            print("${index} ")
        }
    }

}