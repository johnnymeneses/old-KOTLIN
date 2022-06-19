package br.com.johnny.bytebank.modelo

import br.com.johnny.bytebank.modelo.FuncionarioAdmin

class Gerente : FuncionarioAdmin {



        constructor(nome: String,cpf: String,salario: Double,senha: Int) : super(nome = nome,cpf = cpf,salario = salario, senha = senha) {

        }




    override val bonificacao: Double
        get() {
            return (salario * 0.1) + salario
        }



//    fun autentica(senha: Int){    }


}