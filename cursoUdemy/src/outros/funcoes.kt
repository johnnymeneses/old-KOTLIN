fun funcoes(){

    //retorno direto
    areaTerreno(5,6)

    //função com parametro
    qtdeDias(5,1)

}


// Hello World
fun printNome(nome: String){
    println("Ola $nome")
}




//Função com retorno direto
fun areaTerreno(a: Int, b: Int): Int = a*b



//Função com parametro
fun qtdeDias(dia: Int, mes: Int)
{
    var total = ((mes-1)*30)+dia

    println("Já se passaram $total dias")
}