import br.com.johnny.bytebank.modelo.Cliente
import br.com.johnny.bytebank.modelo.Conta
import modelos.contaCorrente
import modelos.contaPoupanca


fun testaCriaContas()
{
    criaCP()
    criaCC()

    println("Total de contas correntes criadas ${contaCorrente.total}")
    println("Total de contas Criadas ${Conta.total}")
}


fun criaCP(){
    val john = Cliente ("johnn","1234578",12345)
    val maria = Cliente ("Maria","1234578",12345)
    val pedro = Cliente ("Maria","1234578",12345)

    val cp = contaPoupanca(john,1234,4444)
    val cp2 = contaPoupanca(maria,1234,4444)
    val cp3 = contaPoupanca(pedro,1234,4444)
}

fun criaCC(){
    val john = Cliente ("johnn","1234578",12345)
    val maria = Cliente ("Maria","1234578",12345)
    val pedro = Cliente ("Maria","1234578",12345)

    val cc = contaCorrente(john,1234,4444)
    val cc2 = contaCorrente(maria,1234,4444)
    val cc3 = contaCorrente(pedro,1234,4444)
}




