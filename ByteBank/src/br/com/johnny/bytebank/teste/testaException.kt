import br.com.johnny.bytebank.exception.SaldoInsuficienteException
import br.com.johnny.bytebank.modelo.*
import java.lang.ClassCastException
import java.lang.NumberFormatException

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