package c_orientacaoObjeto


open class Funcionario(val nome: String,val cpf: String,val salario: Double) {}

class Analista (gnome: String, gcpf: String, gsalario: Double): Funcionario(nome = gnome,cpf = gcpf, salario = gsalario) {}


fun testaHeranca(){

    val balconista = Analista("Johnny", "12345", 7000.0)
    val dentista   = Analista("Dentista", "12345", 7000.0)


}



//Computador pode ser uma especialização de máquina
//um carro pode ser uma maquina
//um trator pode ser uma maquina

//depois de definitir os atributos, adicionar :
//quando vc herda uma classe, vc herda o que a classe pai espera
//a classe pai, para ser herdada precisa da palavra reservada OPEN.


open class Maaquina(val marca: String) {
    open fun minhaMarca() {                          //Para sobrescrever uma função (override) esta precisa estar aberta (fun)
        println("minha marca é $marca")
    }
}

private class Computador(marca: String, val nucleos: Int) : Maaquina(marca) { //private na classe mantem os metodos dela acessivies apenas ao arquivo dentro do proprio arquivo (heranca..kt)

    fun ligar() {}
    fun processar() {}

    //Modificadores de visibilidade
    private fun ligarPrivado() {

    }

    //Override
    override fun minhaMarca() {
        println("Estou reescrevendo minha marca")
//        super.minhaMarca() //Estou me referenciando a classe pai. Minha Marca da classe Herdada
    }

    //Overload - Quando vc tem um mesmo método com assinaturas diferentes. Tipos e/ou quantidades diferentes, parametros diferentes

    fun overload(i: Int) = println("Chamei o overload Int")
    fun overload(i: String) {
        println("Chamei o overload String")
    }

    fun overload(i: Boolean) = println("Chamei o overload Booleano")

}


fun heranca() {

    val dell = Computador("Dell", 15)



    with(dell) {
        ligar()
        println("liguei")
        processar()

        println("processei...")
        minhaMarca()

        overload(1)
        overload("Oi")
    }

    //Chamando os metodos da Classe Computador fora do With
    dell.overload(true)

}
