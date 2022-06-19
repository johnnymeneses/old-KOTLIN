//Classe
//Metodo
//Comportamento
//Atributos  (var nome: String, var anoNascimento: Int)


//Sem parâmetro no construtor
class referencia {
}

//Sem parâmetro no construtor
class referencia2(nome: String) {
}


class Pessoa1

class Pessoa2(var nome: String, val anoNascimento: Int)

class Pessoa3(var nome: String) {

    fun saudacao() {
        println("Olá meu nome é $nome!")
    }


    //Um construtor secundario, sempre exige que o construtor primário seja chamado
    //Como o segundo construtor terá uma variável a mais. É preciso criar esta variavel neste contexto e adicioná-la ao projeto

    var ano: Int? = null

    constructor(nome: String, ano: Int) : this(nome) {// Chamando o construtor primário, e adicionando um novo parâmetro
        this.ano = ano
    }

}


fun classes() {

    println("Classes")

    //Inicializando a classe 3
    val pessoa = Pessoa3("Johnny", 1984)

    //Com o novo construtor é possível instanciar duas pessoas: Uma somente com o nome, e a outra com nome e idade.


    val p1 = Pessoa3("Pessoa 3")
    val p2 = Pessoa3("Pessoa 3 com data", 1984)


    println(p1.nome)
    p1.saudacao()

    println(" ${p2.nome}, data ${p2.ano}")


}