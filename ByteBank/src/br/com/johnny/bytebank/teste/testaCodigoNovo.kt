import br.com.johnny.bytebank.modelo.*

fun testaCodigoNovo() {

//    Classe Any

    val endereco = Endereco(
        bairro = "Vila Mariana",
        numero = 1000,
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        bairro = "Vila Mariana",
        numero = 1000,
        cep = "00000-000"
    )

//    equals: compara objetos
    println(endereco.equals(enderecoNovo)) //false, são objetos diferentes
    println(enderecoNovo.equals(enderecoNovo)) //true, são objetos iguais

//    devolve o hashCode do objeto
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

//    toString : retorna representação do objeto
    println(endereco.toString())
    println(enderecoNovo.toString())


//    Comparando CEP








}



fun objectReference (){

    //    Object Expressions
//    Objeto anônimo, sem classe.
//    Quando vc quer  ter a estrutura de um objeto,  mas não quer criar uma classe

    println("Object Expression")
    val john = object {
        val nome: String = "Johnny"
        val idade: Int = 37
        val senha: Int = 1000

        //Essa função está dentro do Objeto... pesquisar sobre Funcções dentro de Objects

        fun autentica(senha: Int) {
            if (this.senha == senha) {
                println("OK")
            }
        }


    }

    john.autentica(1000)

}

fun objectDeclaration(){

    //Object Declaration que será usado para contador de contas criadas.
    //Este objeto Fica disponível desde a execução do programa até o final
    //Companion Object: Um OB consiga compartilhar seus membros quando ele estrá dentro de uma classe
//    companion   object Contador{        var total= 0
//            private set
//    }


}