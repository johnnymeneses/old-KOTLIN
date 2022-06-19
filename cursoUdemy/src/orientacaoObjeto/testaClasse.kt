/*
    Classe: Uma classe é uma forma de definir um tipo de dado em uma linguagem orientada à objeto. Ela é formada por dados e comportamentos.
    Para definir os dados, são utilizados atributos, e para definir o comportamento são utilizados métodos. Depois que uma classe é definida,
    podem ser criados diferentes obetos que utilizam a classe. O exemplo abaixo mostra a definição da classe Empresa, que tem os atributos nome,
    endereço, CNPJ, data de fundação, faturamento e também o método Imprimir, que apenas mostra os dados da empresa.
* */

class Empresa (
    val nome: String,
    val cnpj: String,
    val endereco: String,
    val faturamento: Double)
{
    fun imprimir(){
        println("Nome: $nome")
        println("CNPJ: $cnpj")
        println("Endereço: $endereco")
        println("Faturamento: $faturamento")
    }
}

fun testaClasse(){

    val banco = Empresa("Diretor","1234568","Nome da Rua",5000.0)
    val escritorio = Empresa ("secao14.Gerente","99887755","Nome da Avenida",8985.0)


    println("Classe Empresa - Objeto Banco")
    banco.imprimir()

    println("Classe Empresa - Objeto Escritório")
    escritorio.imprimir()

}