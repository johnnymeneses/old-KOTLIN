package b_estruturaDados


fun main() {
    branco()
}


//Strings como array
//frist ; last ; String.lenght ; String[index]


fun olaMundo() {

    val nome = "Johnny"
    val sobrenome = "Eder"


    println(nome)
    println(nome[0])
    println(nome.first())
    println(nome.last())
    println(nome.length)
    println(nome[nome.length - 1])

    println(nome + sobrenome)
    println(nome.plus(sobrenome))


}


fun branco() {

    val nome = ""
    val nome2: String? = null

    println(nome.isBlank())
    println(nome.isEmpty())
    println(nome2.isNullOrBlank())
    println(nome2.isNullOrEmpty())

    //Se o tamanho da string (s.lenght) for 0 está empty e black
    //Se o tamanho da string for >0 mas todos os caracteres são espaços em branco,
    // está black mas não empty
}

//FUNÇÕES STRING

fun str1(){
    val str = "Programação Kotlin."
    val str2 = "A                               B"
    println("Tamanho da String: ${str.length}")
    println("Posição 4: ${str[4]}")
    println("Começa com Pro ${str.startsWith("Pro")}") //retorno booleano
    println("Termina com ABC ${str.endsWith("ABC")}")//retorno booleano
    println("Posicao 2 a 4 ${str.substring(2,4)}")
    println("Trocando a por z ${str.replace("a","z")}")
    println("Tudo minusculo ${str.lowercase()}")
    println("Tudo maisculo ${str.uppercase()}")
    println("Sem espaços em branco ${str2.trim()}") //funcionou mas não funcionou

}


