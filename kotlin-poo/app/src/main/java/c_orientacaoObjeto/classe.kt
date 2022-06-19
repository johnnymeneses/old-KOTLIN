package c_orientacaoObjeto

//Classe

//Conceito: Classe: Uma classe é uma forma de definir um tipo de dado em uma linguagem orientada à objeto.
// Ela é formada por dados e comportamentos. Para definir os dados, são utilizados atributos,
// e para definir o comportamento são utilizados métodos. Depois que uma classe é definida, podem ser criados diferentes obetos que utilizam a classe.
// O exemplo abaixo mostra a definição da classe Empresa, que tem os atributos nome,  endereço, CNPJ, data de fundação, faturamento e também o método Imprimir,
// que apenas mostra os dados da empresa.


class Empresa(val nome: String, val cnpj: String, val endereco: String, val faturamento: Double) {

    fun imprimir() {
        println("Nome: $nome")
        println("CNPJ: $cnpj")
        println("Endereço: $endereco")
        println("Faturamento: $faturamento")
    }
}

fun testaClasse() {

    val banco = Empresa("Diretor", "1234568", "Nome da Rua", 5000.0)
    val escritorio = Empresa("secao14.Gerente", "99887755", "Nome da Avenida", 8985.0)

    println("Classe Empresa - Objeto Banco")
    banco.imprimir()

    println("Classe Empresa - Objeto Escritório")
    escritorio.imprimir()

}

//Declaração de classes
//Em Kotlin, um arquivo pode conter diferentes declarações de classes, as quais são feitas utilizando a palavra reservada *`class`*.
// Abaixo representamos uma declaração de classe feita da forma mais simples possível em Kotlin

class Medicamento1

//No exemplo acima, uma vez que a classe Medicamento não possui um corpo, podemos omitir as chaves que estariam na frente do seu nome.

//Construtores
//Um construtor é uma função especial da classe, utilizada na croação e inicialização dos objetos derivados dela.
//Kotlin distingue os construtores de uma classe entre primários e secundários.
// O contrutor primário de uma classe faz parte do seu cabeçalho e pode conter apenas uma lista de parâmetros, assim como apresentado abaixo.

class Medicamento2(val formula: String, val posologia: String)

//Dado que o construtor primário nao pode conter nenhum código, uma classe pode conter um ou mais blocos de inicialização,
// que são executados na ordem como são declarados no corpo da mesma. Nesses blocos de inicialização, conforme visto no **código 1**.
// podemos acessar quaisquer parâmetros que estejam presentes no construtor primário. A relação entre construtor primário e propriedades será detalhado ainda neste artigo.


class Medicamento3(val formula: String, val posologia: String) {

    init {
        require(formula.trim().length > 0) {
            "Informe uma fórmula"
        }

        require(posologia.trim().length > 0)
        {
            "Informe uma posologia"
        }

    }
}

//Além do construtor primário, uma classe também pode declarar um ou mais construtores secundários.
// Esses, por sua vez, sempre devem utilizar a palavra reservada `constructor` em suas declarações, mesmo quando um modificador de acesso for omitivo ou nenhuma anotação for utilizada, como mostra o Código 2.


class Medicamento4 {
    constructor(formula: String, posologia: String)
}


//Outros exemplos de Construtores

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

    constructor(
        nome: String,
        ano: Int
    ) : this(nome) {// Chamando o construtor primário, e adicionando um novo parâmetro
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