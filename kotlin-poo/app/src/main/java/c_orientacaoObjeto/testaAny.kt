package c_orientacaoObjeto

fun testaAny() {

    val endereco = Endereco(numero=20, logradouro="rua de baixo", cep = "000000")
    val  enderecoNovo = Endereco(numero= 20, logradouro = "rua de baixo", cep = "000000")

//   equals: indica se algum dos objetos é igual ao outro
    println(endereco.equals(enderecoNovo)) //false
    println(endereco.equals(endereco)) //true


    println(endereco.hashCode())//2093631819
    println(enderecoNovo.hashCode())//2074407503

    println(endereco.toString()) //br.com.johnny.bytebank.modelo.Endereco@7cca494b
    println(enderecoNovo.toString()) //br.com.johnny.bytebank.modelo.Endereco@7ba4f24f
}

fun main(){
    println("Aula de OO")
}