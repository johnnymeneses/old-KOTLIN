package solutions
class Diretor (val nome: String,val senha: Int)


fun validaEntrada(user: Diretor, minhaSenha: Int){

    if(minhaSenha == user.senha){
        println("Bem Vindo!")
    }else
    {
        println("Acesso Negado")
    }
}

fun main() {

    println("Testa Sistema de Autenticação")

    val funcDiretor = Diretor("Johnny",123456)

    validaEntrada(funcDiretor, 123456)

}


