package br.com.johnny.bytebank.modelo

class Analista (gnome: String, gcpf: String, gsalario: Double): Funcionario(nome = gnome,cpf = gcpf, salario = gsalario) {

    override val bonificacao: Double
        get() {
            return salario * 0.1
        }



}