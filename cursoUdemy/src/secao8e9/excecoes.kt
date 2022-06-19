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