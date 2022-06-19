package a_conceitos

class Maquinario(var marca: String) {

    var nucleos: Int = 0
        //forçando o get e set com o FIELD
        get() {
            println("Get foi chamado")
            return field
        }
        set(value) {
//            this.nucleos = value
            println("SET foi chamado")
            field = value
        }


    fun ligar() {
        println("Ligando ..")
    }

    fun processar() {
        println("Processando ..")


    }

    fun desligar() {
        println("Desligando ..")
    }

}


fun with() {

    println("With")
    //Se vc quer chamar métodos da mesma classe, com a mesma variavel, vc pode usar o with

    val m = Maquinario("Nextel")

    println("sem with")
    m.ligar()
    m.processar()
    m.desligar()

    println("")

    println("com with")
    with(m) {
        ligar()
        processar()
        desligar()
    }


}