
import br.com.johnny.bytebank.modelo.*


fun testaFuncionarios() {



//    Criar br.com.johnny.bytebank.modelo.Analista
        val funcAnalista = Analista("Analista","12345",1000.0)
        //Bonificação esperada: Salario * 0.1

//    Criar br.com.johnny.bytebank.modelo.Auxiliar
        val funcAuxiliar = Auxiliar("Auxiliar","45678",1000.0)
        //Bonificação Salario + 100

//    Criar br.com.johnny.bytebank.modelo.Diretor
        val funcDiretor = Diretor("Diretor","34443",1000.0,1234,500.0)
        //Bonificação (Salario * 0.3) + PLR

//    Criar br.com.johnny.bytebank.modelo.Gerente
        val funcGerente = Gerente("Gerente","55445",1000.0,5678)

        //Bonificacao (Salario * 0.1) + salario
//    Exibir Funcionarios criados

    println("Funcionario : ${funcAnalista.nome}, Salário:  ${funcAnalista.salario}")
    println("Funcionario : ${funcAuxiliar.nome}, Salário:  ${funcAuxiliar.salario}")
    println("Funcionario : ${funcDiretor.nome}, Salário:  ${funcDiretor.salario}")
    println("Funcionario : ${funcGerente.nome}, Salário:  ${funcGerente.salario}")


//    Calculo de Bonificação
        val bonifica = CalculadoraBonificacao()
        bonifica.registra(funcAnalista)
        bonifica.registra(funcAuxiliar)
        bonifica.registra(funcDiretor)
        bonifica.registra(funcGerente)

        println("")
        println("Total de Bonificações: ${bonifica.total}")

    //Total de Funcionários
    println("Total de funcionários: ${Funcionario.total}")

}


