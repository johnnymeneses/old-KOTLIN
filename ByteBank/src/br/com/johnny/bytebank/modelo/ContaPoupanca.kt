package modelos

import br.com.johnny.bytebank.exception.SaldoInsuficienteException
import br.com.johnny.bytebank.exception.ValorInvalidoException
import br.com.johnny.bytebank.modelo.Cliente
import br.com.johnny.bytebank.modelo.Conta

class contaPoupanca: Conta {


    constructor(titular: Cliente, agencia: Int, numeroConta: Int,) : super (titular, agencia, numeroConta,)
 {
//     totalContasCriadas
 }

    init {
//        contaCorrente.total++
//        println("Criando conta poupança")
    }


    //Implementação de Saque
    //Não permitir Saque acima do saldo
    //Não permitir Saque negativo
    override fun sacarRecurso(valor: Double) {

        //Não permitir saque com valor negativo
        if(valor<=0){
            throw  ValorInvalidoException(mensagem = "CP - R$$valor é um invalido. Operação cancelada")
        }

        if(saldo<valor){
            throw  SaldoInsuficienteException(mensagem = "CP - Saldo R$ $saldo insuficiente para o saque de R$ $valor")
        }
            saldo-=valor



    }


    //Implementação de Depósito
    //Não permitir Deposito zerado ou negativo
    override fun depositaRecurso(valor: Double) {
       if(valor<=0)
       {
           throw  ValorInvalidoException(mensagem = "CP - R$$valor é um invalido. Operação cancelada")
       }

        this.saldo += valor

    }


    //Implementação de Transferência
    //Não permitir Transferencia acima do saldo
    //Não permitir Transferencia negativo
    //Não permitir transferência pra própria conta (Mensagem de erro?)
    override fun transfereRecurso(valor: Double, contaDestino: Conta){
//        if(br.com.johnny.bytebank.modelo.Conta == contaDestino)
//        {
//            return
//        }

        if(valor<=0){
            throw  ValorInvalidoException(mensagem = "CP - R$$valor é um invalido. Operação cancelada")
        }

        if(saldo< valor)
        {
            throw  SaldoInsuficienteException(mensagem = "CP - Saldo R$ $saldo insuficiente para o saque de R$ $valor")
        }
        saldo-=valor
        contaDestino.depositaRecurso(valor)

    }

}




