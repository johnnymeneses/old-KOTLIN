package logica

/*
A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. 
Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), 
e quanto deve guardar numa conta de poupança (10% do total arrecadado). Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos,
faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.
*/

fun main() = ex05(10, 15)


fun ex05(paesVendidos: Int, broasVendidas: Int) {
    val paesTotal = paesVendidos * 0.12
    val broasTotal = broasVendidas * 1.5

    val poupanca = paesTotal + broasTotal

    println("Foram vendidos $paesVendidos pães e $broasVendidas broas, totalizando R$ $poupanca")

    println("É necessario guardar na poupança R$ " + poupanca * 0.1)

}
