package modelos

import br.com.johnny.bytebank.exception.SaldoInsuficienteException
import br.com.johnny.bytebank.exception.ValorInvalidoException
import br.com.johnny.bytebank.modelo.Cliente
import br.com.johnny.bytebank.modelo.Conta
import kotlin.reflect.jvm.internal.ReflectProperties

class contaCorrente(titular: Cliente, agencia: Int, numeroConta: Int) :  Conta(titular, agencia, numeroConta)
{

//    Contador especifico de contas correntes
    companion object contaCC{
        var total = 0
            private set
    }

    init {
        total++
//        println("Criando contas correntes")
    }

    //Implementação de Depósito
    //Não permitir Deposito zerado ou negativo
    override fun depositaRecurso(valor: Double) {
        if(valor<=0) {
            throw  ValorInvalidoException(mensagem = "CC - Valor $valor é invalido ")
        }
            this.saldo += valor

    }

    override fun sacarRecurso(valor: Double)  {

        val valorComTaxa  = valor+0.1

        //Não permitir saque com valor negativo
        if(valor<=0) {
            throw  ValorInvalidoException(mensagem = "CC - Valor $valor é invalido ")
        }

        //Não permitir Saque acima do saldo
        if(saldo<valorComTaxa)
        {
            throw  SaldoInsuficienteException(mensagem = "CC - Saldo R$ $saldo insuficiente para o saque de R$ $valor")
        }

        saldo-=valorComTaxa



    }

    fun sacarRecursoSemTaxa(valor: Double){

        //Não permitir saque com valor negativo
        if(valor<=0){
            throw  ValorInvalidoException(mensagem = "CC - R$$valor é um invalido. Operação cancelada")
        }

        if(saldo<valor){
            throw  SaldoInsuficienteException(mensagem = "CC - Saldo R$$saldo insuficiente para o saque de R$ $valor")
        }

        saldo-=valor

}


    //Implementação de Transferência
    //Não permitir Transferencia acima do saldo
    //Não permitir Transferencia negativo
    //Não permitir transferência pra própria conta (Mensagem de erro?)
    override fun transfereRecurso(valor: Double, contaDestino: Conta){


        //Não permitir saque com valor negativo
        if(valor<=0){
            throw  ValorInvalidoException(mensagem = "CC - R$$valor é um invalido. Operação cancelada")
        }

        if(saldo<valor){
            throw  SaldoInsuficienteException(mensagem = "CC - Saldo R$$saldo insuficiente para o saque de R$ $valor")
        }
        saldo-=valor
         contaDestino.depositaRecurso(valor)

    }

}