package br.com.johnny.bytebank.teste

import br.com.johnny.bytebank.exception.SaldoInsuficienteException
import br.com.johnny.bytebank.exception.ValorInvalidoException
import br.com.johnny.bytebank.modelo.Cliente
import modelos.contaCorrente
import modelos.contaPoupanca


//Cliente 1
val john = Cliente("johnn", "1234578", 12345)
//Contas
val cc = contaCorrente(john, 1234, 4444)
val cp = contaPoupanca(john, 4565, 5656)


//Cliente 2
val maria = Cliente("Maria", "1234578", 12345)
val cc2 = contaCorrente(maria, 1234, 4444)
val cp2 = contaPoupanca(maria, 4444, 6565)


fun testaContaException(){

//        depositaCC()
//        depositaCP()
//        saqueCC()
//        saqueCCsemTaxa()
//        saqueCP()
//        transferenciaCC()
//        transferenciaCP()
        transferenciaCPCC()
}

fun depositaCC(){

        try {
                println("Saldo atual ${john.nome} R$ ${cc.saldo}")
                cc.depositaRecurso(-500.0) //Valor Inválido
//                cc.depositaRecurso(500.0) //Valor OK
                println("Novo Saldo ${john.nome} R$ ${cc.saldo}")
        }catch(e: ValorInvalidoException)
        {
                println("Valor inválido")
                e.printStackTrace()
        }catch (e: Exception){
                println("erro desconhecido")
                e.printStackTrace()
        }
}

fun depositaCP(){
        try {
                println("Saldo atual ${john.nome} R$ ${cp.saldo}")
//                cp.depositaRecurso(-500.0) //Valor Inválido
                cp.depositaRecurso(500.0) //Valor OK
                println("Novo Saldo ${john.nome} R$ ${cp.saldo}")
        }catch(e: ValorInvalidoException)
        {
                println("Valor inválido")
                e.printStackTrace()
        }
}

fun saqueCC(){

        try{
                println("Saldo atual ${john.nome} R$ ${cc.saldo}")
//                cc.sacarRecurso(-100.0)//Saque Valor Inválido
//                cc.sacarRecurso(25000.0) //Saque Valor Insuficiente
                cc.sacarRecurso(50.0) //Saque OK
                println("Novo Saldo ${john.nome} R$ ${cc.saldo}")
        }catch(e: ValorInvalidoException)
        {
                println("Caiu na Expection de Valor inválido")
                e.printStackTrace()
        }catch(e: SaldoInsuficienteException)
        {
                println("Caiu na Expection de Saldo Insuficiente")
                e.printStackTrace()
        }
}

fun saqueCCsemTaxa(){
        try{
                println("Saldo atual ${john.nome} R$ ${cc.saldo}")
//                cc.sacarRecursoSemTaxa(-100.0)//Saque Valor Inválido
//                cc.sacarRecursoSemTaxa(25000.0) //Saque Valor Insuficiente
                cc.sacarRecursoSemTaxa(50.0) //Saque OK
                println("Novo Saldo ${john.nome} R$ ${cc.saldo}")
        }catch(e: ValorInvalidoException)
        {
                println("Caiu na Expection de Valor inválido")
                e.printStackTrace()
        }catch(e: SaldoInsuficienteException)
        {
                println("Caiu na Expection de Saldo Insuficiente")
                e.printStackTrace()
        }

}

fun saqueCP(){
        try{
                println("Saldo atual ${john.nome} R$ ${cp.saldo}")
//                cp.sacarRecurso(-100.0)//Saque Valor Inválido
//                cp.sacarRecurso(25000.0) //Saque Valor Insuficiente
                cp.sacarRecurso(50.0) //Saque OK
                println("Novo Saldo ${john.nome} R$ ${cp.saldo}")
        }catch(e: ValorInvalidoException)
        {
                println("Caiu na Expection de Valor inválido")
                e.printStackTrace()
        }catch(e: SaldoInsuficienteException)
        {
                println("Caiu na Expection de Saldo Insuficiente")
                e.printStackTrace()
        }
}

fun transferenciaCC(){
        try {
                println("Saldo atual ${john.nome} R$ ${cc.saldo}")
                println("Saldo atual ${maria.nome} R$ ${cc2.saldo}")

//                cc.transfereRecurso(-50.0, cc2) //Transferencia Invalida
//                cc.transfereRecurso(5000.0, cc2) //Tranferencia Insuficiente
                cc.transfereRecurso(50.0, cc2)//Transferencia OK

                println()
                println("Novo Saldo ${john.nome} R$ ${cc.saldo}")
                println("Novo Saldo ${maria.nome} R$ ${cc2.saldo}")
        } catch (e: ValorInvalidoException) {
                println("Caiu na Expection de Valor inválido")
                e.printStackTrace()

        } catch (e: SaldoInsuficienteException) {
                println("Caiu na Expection de Saldo Insuficiente")
                e.printStackTrace()
        }

}

fun transferenciaCP(){
        try {
                println("Saldo atual ${john.nome} R$ ${cp.saldo}")
                println("Saldo atual ${maria.nome} R$ ${cp2.saldo}")

//                cp.transfereRecurso(-50.0, cp2) //Transferencia Invalida
                cp.transfereRecurso(5000.0, cp2) //Tranferencia Insuficiente
//                cp.transfereRecurso(50.0, cp2)//Transferencia OK

                println()
                println("Novo Saldo ${john.nome} R$ ${cp.saldo}")
                println("Novo Saldo ${maria.nome} R$ ${cp2.saldo}")
        } catch (e: ValorInvalidoException) {
                println("Caiu na Expection de Valor inválido")
                e.printStackTrace()

        } catch (e: SaldoInsuficienteException) {
                println("Caiu na Expection de Saldo Insuficiente")
                e.printStackTrace()
        }

}


fun transferenciaCPCC(){
        try {
                println("Saldo atual Conta Corrente ${john.nome} R$ ${cc.saldo}")
                println("Saldo atual Conta Poupança ${john.nome} R$ ${cp.saldo}")

//                cc.transfereRecurso(-50.0, cp) //Transferencia Invalida CC
//                cp.transfereRecurso(-50.0, cc) //Transferencia Invalida CP

//                cc.transfereRecurso(5000.0, cp) //Tranferencia Insuficiente CC
//                cp.transfereRecurso(5000.0, cc) //Tranferencia Insuficiente CP

                cc.transfereRecurso(50.0, cp)//Transferencia OK CC
                cp.transfereRecurso(50.0, cc)//Transferencia OK CP

                println()
                println("Novo saldo Conta Corrente ${john.nome} R$ ${cc.saldo}")
                println("Novo saldo Conta Poupança ${john.nome} R$ ${cp.saldo}")
        } catch (e: ValorInvalidoException) {
                println("Caiu na Expection de Valor inválido")
                e.printStackTrace()

        } catch (e: SaldoInsuficienteException) {
                println("Caiu na Expection de Saldo Insuficiente")
                e.printStackTrace()
        }

}

