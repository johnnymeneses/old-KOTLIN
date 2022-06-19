package c_orientacaoObjeto



// Uma interface define um contrato, quem herda deve assinar
//interface nao consegue ter estado. nao consegue ter astribuição de variavel



interface Maquina {

    fun ligar()
    fun desligar()
}

class Computador3 : Maquina {
    override fun ligar() {
        println("Ligando Dell")
    }

    override fun desligar() {
        println("Desligando Dell")
    }

}


class Trator : Maquina{
    override fun ligar() {
        println("Ligando Trator")
    }

    override fun desligar() {
        println("Desligando Trator")
    }
}


fun mainInterface() {
    println("Interfaces")

    val dell = Computador3()
    val ibec = Trator()

    dell.ligar()
    dell.desligar()

    ibec.ligar()
    ibec.desligar()

}