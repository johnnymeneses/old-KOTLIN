package d_exercicios_logica/*
Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais conseguiu poupar.
Faça um algoritmo para ler a quantidade de cada tipo de moeda, e imprimir o valor total economizado, em reais.
Considere que existam moedas de 1, 5, 10, 25 e 50 centavos, e ainda moedas de 1 real.

Não havendo moeda de um tipo, a quantidade respectiva é zero.

 */


fun confrinho(um: Int, cinco: Int, dez: Int, doisCinco: Int, cinquenta: Int, umReal : Int){

    var total = (um * 0.01) + (cinco * 0.05) + (dez * 0.10) + (doisCinco * 0.25) + (cinquenta * 0.50) + (umReal*1)

    println("R$ $total")

}