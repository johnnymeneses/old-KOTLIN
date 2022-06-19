package br.com.johnny.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double) {


    abstract val bonificacao: Double

    companion object contaFuncionarios{
        var total = 0
            private set
    }

    init {
        total++
        println("Criando Funcionarios")
    }


}

