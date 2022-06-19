package a_conceitos

import kotlin.math.sin

//Funções

//Função é uma pequena parte do programa que possui uma responsabilidade específica e pode ser usada quando necessário

//Retornos de Função:
//Unit: O tipo Unit diz que uma função não possui retorno. A função executa seu corpo e termina sua execução

//Double, FLoat, Long, Int, Short, Byte, Boolean, String e Char**
//Uma função também pode executar seu corpo e fornecer uma resposta para seu chamador. Os mesmos tipos que são usados para declaração de variáveis, servem como retorno de funções

//Instâncias de classes**
//Uma função é capaz de retornar um tipo de dado resultante da instâqncia de uma classe


fun soma(a: Int, b: Int): Int {
    return a + b
}

fun soma2(a: Int, b: Int): Int = a + b

fun max(a: Int, b: Int) {
    var soma = a + b
}

// Hello World
fun printNome(nome: String) {
    println("Ola $nome")
}

//Função com retorno direto
fun areaTerreno(a: Int, b: Int): Int = a * b
//areaTerreno(5,6)


//Função com parametro
fun qtdeDias(dia: Int, mes: Int) {
    var total = ((mes - 1) * 30) + dia
    println("Já se passaram $total dias")
}
//   qtdeDias(5, 1)

fun divisao(a: Float, b: Float) = a / b


//FUNÇÕES STRING

fun str1() {
    val str = "Programação Kotlin."
    val str2 = "A                               B"
    println("Tamanho da String: ${str.length}")
    println("Posição 4: ${str[4]}")
    println("Começa com Pro ${str.startsWith("Pro")}") //retorno booleano
    println("Termina com ABC ${str.endsWith("ABC")}")//retorno booleano
    println("Posicao 2 a 4 ${str.substring(2, 4)}")
    println("Trocando a por z ${str.replace("a", "z")}")
    println("Tudo minusculo ${str.lowercase()}")
    println("Tudo maisculo ${str.uppercase()}")
    println("Sem espaços em branco ${str2.trim()}") //funcionou mas não funcionou

}


fun parametros() {

//    endereco("Nome Rua","São Paulo","SP","01014000","145")
    endereco(cidade = "São Paulo", estado = "SP", cep = "54654")

}


//Em alguns casos, as funções podem receber muitos paaremtros. Como lidar com o caso de ser necessário manter
//todos os parametros , mas nao ter todos disponíveis na chamada: receber um valor Default

fun endereco(
    rua: String = "Rua",
    cidade: String,
    estado: String,
    cep: String,
    numero: String = "1515"
) {
    println("Rua $rua")
    println("Cidade: $cidade, $estado, - $cep")

}

//::Funções ordem superior
//Recebem outra função ou lambda por parâmetro
//stante úteis para a generalização de funções e tratamento de erros




fun ordemSuperior(){

    var x: Int
    var y: Int
    var z: Int

    x = calculate(12, 4, ::sum)
    y = calculate(12, 4, ::multiplica)
    z = calculate(50,2) {a,b -> a/b}


    println(x)
    println(y)
    println(z)


}
    fun sum (a:Int, b: Int) = a.plus(b)
    fun multiplica (a:Int, b: Int) = a*b


fun calculate(n1: Int, n2: Int,operation:(Int,Int)->Int)  = operation (n1,n2)


fun calculate2(n1: Int, n2: Int,operation:(Int,Int)->Int):Int{
    val result = operation (n1,n2)
    return result
}

//Operation:(Int,Int)->Int):Int espressão Lamba



//Função Single Line
fun singleLine(name: String, lastame: String) = println("$name $lastame")


//Funções que só podem ser chamadas por determinado tipo
//prefixo fun Tipo.nomeDaFuncao()

fun String.randomCapitalizedLetter()=
    this[(0..this.length-1).random()].uppercaseChar()



fun main(){
    var jo = "Pedro"

    println(jo.randomCapitalizedLetter())

}