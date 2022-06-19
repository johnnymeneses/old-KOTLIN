import br.com.johnny.bytebank.modelo.Cliente
import br.com.johnny.bytebank.modelo.Conta
import modelos.contaCorrente
import modelos.contaPoupanca

fun testaContas()
{

    testaCP()
    testaCC()


}


fun testaCC()
{
    val john = Cliente ("johnn","1234578",12345)
    val maria = Cliente ("Maria","1234578",12345)
    val pedro = Cliente ("Maria","1234578",12345)

    val cc = contaCorrente(john,1234,4444)
    val cc2 = contaCorrente(maria,1234,4444)
    val cc3 = contaCorrente(pedro,1234,4444)





    println("Número da Conta: ${cc.numeroConta}")
    println("Agência: ${cc.agencia}")
    println("Saldo R$: ${cc.saldo}")
    println("")

    println("Depósito de R$100")
    cc.depositaRecurso(100.0)
    println("Novo Saldo R$: ${cc.saldo}")
    println("")

    println("Saque de R$ -500")
    cc.sacarRecurso(99.6)
    println("Novo Saldo R$: ${cc.saldo}")
    println("")



    println("Transferencia")


    println("Conta Corrente 1 ")
    println("Saldo R$: ${cc.saldo}")
    println("")
    println("Conta Corrente 2 ")
    println("Saldo R$: ${cc2.saldo}")

    cc.transfereRecurso(50.0,cc2)
    println("Novo Saldo CC 1 R$: ${cc.saldo}")
    println("Novo Saldo CC 2 R$: ${cc2.saldo}")

}

fun testaCP()
{

    val john = Cliente ("johnn","1234578",12345)
    val maria = Cliente ("Maria","1234578",12345)
    val pedro = Cliente ("Maria","1234578",12345)

    val cp = contaPoupanca(john,1234,4444)
    val cp2 = contaPoupanca(maria,1234,4444)
    val cp3 = contaPoupanca(pedro,1234,4444)







    println("Conta Poupança")


    println("Número da Conta: ${cp.numeroConta}")
    println("Agência: ${cp.agencia}")
    println("Saldo R$: ${cp.saldo}")
    println("")

    println("Depósito de R$100")
    cp.depositaRecurso(1.0)
    println("Novo Saldo R$: ${cp.saldo}")
    println("")

    println("Saque de R$ -500")
    cp.sacarRecurso(-500.0)
    println("Novo Saldo R$: ${cp.saldo}")
    println("")



    println("Transferencia")


    println("Conta Poupança 1 ")
    println("Saldo R$: ${cp.saldo}")
    println("")
    println("Conta Poupança 2 ")
    println("Saldo R$: ${cp2.saldo}")

    cp.transfereRecurso(50.0,cp)
    println("Novo Saldo CP 1 R$: ${cp.saldo}")
    println("Novo Saldo CP 2 R$: ${cp2.saldo}")
}
