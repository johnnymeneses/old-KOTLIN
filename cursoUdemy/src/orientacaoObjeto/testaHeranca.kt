/*
    Herança:


* */

open class Funcionario(val nome: String,val cpf: String,val salario: Double) {}

class Analista (gnome: String, gcpf: String, gsalario: Double): Funcionario(nome = gnome,cpf = gcpf, salario = gsalario) {}


fun testaHeranca(){

    val balconista = Analista("Johnny", "12345", 7000.0)
    val dentista   = Analista("Dentista", "12345", 7000.0)


}








