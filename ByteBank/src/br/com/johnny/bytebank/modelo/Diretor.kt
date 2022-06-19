package br.com.johnny.bytebank.modelo

class Diretor (gnome: String,
               gcpf: String,
               gsalario: Double,
               gsenha: Int,
               val plr: Double): FuncionarioAdmin(
                    nome = gnome,
                    cpf = gcpf,
                    salario = gsalario,
                senha = gsenha) {

    override val bonificacao: Double
        get() {
            return (salario *0.3 ) + plr
        }



//    fun autentica(senha: Int){    }


}