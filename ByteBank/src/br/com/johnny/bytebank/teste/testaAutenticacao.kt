import br.com.johnny.bytebank.modelo.Cliente
import br.com.johnny.bytebank.modelo.Diretor
import br.com.johnny.bytebank.modelo.Gerente
import br.com.johnny.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {

    val funcDiretor = Diretor("br.com.johnny.bytebank.modelo.Diretor", "34443", 1000.0, 1234, 500.0)

    val funcGerente = Gerente("br.com.johnny.bytebank.modelo.Gerente", "55445", 1000.0, 5678)

    val cliente = Cliente("br.com.johnny.bytebank.modelo.Cliente","23443",556655)

    val acesso = SistemaInterno()

    print("Acesso br.com.johnny.bytebank.modelo.Diretor: ")
    acesso.validaEntrada(funcDiretor, 1234)
    println("")

    print("Acesso br.com.johnny.bytebank.modelo.Gerente: ")
    acesso.validaEntrada(funcGerente,5678)
    println("")

    print("Acesso br.com.johnny.bytebank.modelo.Cliente: ")
    acesso.validaEntrada(cliente,556655)
    println("")




}


