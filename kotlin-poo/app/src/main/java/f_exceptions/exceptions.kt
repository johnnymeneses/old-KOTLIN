package f_exceptions
/*
Exemplo

```kotlin
import java.lang.NumberFormatException

fun excecoes() {

    try {
        println("33".toInt()) //Essa conversão não funciona
    } catch (e: NumberFormatException) {
        println("Este valor não é um número: ${e.message}")
        println(e.printStackTrace())

    } catch (e: Exception) { // Erro genérico sempre por último
        println("Erro Genérico: ${e.message}")
    } finally {
        println("Realizou alguma acao independente de erro ou acerto")
        //bom pra sinalizar um lugar onde fechar o programa
    }

}
```

Classes e Uso

```kotlin
//Toda Exception deriva da classe Throwable
class SaldoInsuficienteException(
    mensagem: String= "Saldo Insuficiente"): Exception (mensagem)

//Valor Inválido
class ValorInvalidoException(
    mensagem:String = "Este valor é invalido.") : Exception (mensagem)

//Uso
override fun sacarRecurso(valor: Double)  {

    val valorComTaxa  = valor+0.1

    //Não permitir saque com valor negativo
    if(valor<=0) {
        throw  ValorInvalidoException(mensagem = "CC - Valor $valor é invalido ")
    }

    //Não permitir Saque acima do saldo
    if(saldo<valorComTaxa)
    {
        throw  SaldoInsuficienteException(mensagem = "CC - Saldo R$ $saldo insuficiente para o saque de R$ $valor")
    }

    saldo-=valorComTaxa

}

```

Uso de Exceptions com TryCatch

```kotlin
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
```*/