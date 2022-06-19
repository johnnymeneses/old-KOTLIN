package br.com.johnny.bytebank.modelo

abstract class Conta (val titular: Cliente, val agencia: Int, val numeroConta: Int ) {

    var saldo: Double = 100.0
    protected set


    //Object Declaration que será usado para contador de contas criadas.
    //Este objeto Fica disponível desde a execução do programa até o final
    //Companion Object: Um OB consiga compartilhar seus membros quando ele estrá dentro de uma classe
   companion object Contador{
        var total= 0
        private set
    }


//    var total : Int = 1
//    protected set

init{
//    println("Criando Contas")
    total++
}
    abstract fun depositaRecurso(valor: Double)

    abstract fun sacarRecurso(valor: Double)

    abstract fun transfereRecurso(valor: Double, contaDestino: Conta)




}