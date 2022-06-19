package d_exercicios_logica

interface Vendas{
    fun imprimir()
    fun deletar()
}

class vendidos: Vendas {
    override fun imprimir() {
        TODO("Not yet implemented")
    }

    override fun deletar() {
        TODO("Not yet implemented")
    }

}
class Divisao {
    var num1: Int = 10
        private set
    var num2: Int = 20
        private set


    fun mudaNumeroA(numA: Int){
        num1 = numA
    }

    fun mudaNumeroB(numB: Int){
        num2 = numB
    }

}


class Pedido(
    val id: Int,
    val desc: String,
    val qtde: Int
) {

    fun imprimir() {
        println("ID: $id")
        println("Descrição: $desc")
        println("Quantidade: $qtde")
    }
}

fun main(){

    var primeiroNumero = Divisao()
    println(primeiroNumero.num1)
    println(primeiroNumero.num2)

    primeiroNumero.mudaNumeroA(55)
    primeiroNumero.mudaNumeroB(66)

    println(primeiroNumero.num1)
    println(primeiroNumero.num2)

    val vendaUm = Pedido(1, "tesoura", 4)
    val vendaDois = Pedido(2, "Lapiseira", 1)
    val vendaTres = Pedido(3, "Canetas", 10)

    vendaUm.imprimir()
    vendaDois.imprimir()
    vendaTres.imprimir()
}