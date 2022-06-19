package f_exceptions

class SaldoInsuficienteException(
    mensagem: String= "Saldo Insuficiente"): Exception (mensagem)


fun main(){
    teste2()
}

fun teste2()
{
    for (i in 1..5) {
        println(i)
        if (i <= 3) {

        } else {
            throw SaldoInsuficienteException()
        }

    }
    println("Terminou")

}

fun testaException()
{
    try{
        teste2()
    }catch (e: SaldoInsuficienteException){
        e.printStackTrace()
        println("Pegamos a excpetion")
    }
    println("Fim da Funcao")
}