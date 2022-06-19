package a_conceitos
//Conceito: The root of the Kotlin class hierarchy. Every Kotlin class has Any as a superclass.

//Uso

class Endereco(
    val numero: Int,
    val logradouro: String,
    val cep: String
)

fun testaAny() {

    val endereco = Endereco(numero = 20, logradouro = "rua de baixo", cep = "000000")
    val enderecoNovo = Endereco(numero = 20, logradouro = "rua de baixo", cep = "000000")

//  Indicates whether some other object is "equal to" this one.
    println("EQUAL")
    println(endereco.equals(enderecoNovo)) //false
    println(endereco.equals(endereco)) //true
    println("")

//    Returns a hash code value for the object.
    println("HASH")
    println(endereco.hashCode())//2093631819
    println(enderecoNovo.hashCode())//2074407503
    println("")


//  Returns a string representation of the object.
    println("to STRING")
    println(endereco.toString()) //br.com.johnny.bytebank.modelo.Endereco@7cca494b
    println(enderecoNovo.toString()) //br.com.johnny.bytebank.modelo.Endereco@7ba4f24f
    println("")

}


fun main(){
    testaAny()
}