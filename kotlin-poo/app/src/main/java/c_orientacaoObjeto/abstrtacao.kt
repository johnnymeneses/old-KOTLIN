package c_orientacaoObjeto

//Conceito:

//Utilização

















//Mamifero - Animal

abstract class Mamifero(var nome:String){ // Cla
    abstract fun falar()

    var peso: Float = 0f

    open fun dormir(){
        println("Zzz....")
    }
}

class Cachorro (nome:String, meuPeso: Float) : Mamifero (nome){

    //Executado quando uma classe é iniciada
    init{
        this.peso= meuPeso
    }

    override fun falar() {
        println("au au")
    }


}

class Gato (nome:String): Mamifero (nome){
    override fun falar() {
        println("miau miau")
    }

    override fun dormir() {
        println("ZZZ.... miau miau")
    }
}



fun mainAbstrato(){

    val bolinha = Cachorro("Bolinha",100f)
    println("Cachorro ${bolinha.nome}, peso ${bolinha.peso}")
    Cachorro("Bolt",50.0f).falar()
    bolinha.dormir()

    val bilbo = Gato("Bilbo")
    println("Gato ${bilbo.nome}")


    Gato("Consuelo").falar()
    bilbo.dormir()


}