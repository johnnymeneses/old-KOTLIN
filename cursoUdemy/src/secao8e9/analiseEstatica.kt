fun analiseEstatica(){

    meuNome("Johnny")
    meuNomeIdade("Eder",25)
}


fun meuNome(nome: String){
    println("Ola $nome")
}

fun letraIndice(nome: String, indice: Int): Char{
    return nome[indice]
}

fun meuNomeIdade(nome: String, idade:Short){
    println("Ola, $nome! Tenho $idade anos")
}