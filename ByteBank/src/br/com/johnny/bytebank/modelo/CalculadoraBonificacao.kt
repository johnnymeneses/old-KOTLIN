package br.com.johnny.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario)
    {
        println("Nome: ${funcionario.nome} Bonificação: ${funcionario.bonificacao}")
        this.total+= funcionario.bonificacao
    }


//  Opção com Any
    fun registraAny(funcionario: Any){
        funcionario as Funcionario
        this.total+=funcionario.bonificacao
    }
    //Problema do cast é poder enviar qualquer valor
    //    bonifica.registra(1)
    //    java.lang.ClassCastException


}