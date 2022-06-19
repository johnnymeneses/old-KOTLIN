package b_estruturaDados

import java.math.BigDecimal
import java.math.RoundingMode

fun SalarioBigDecimal() {

    println("Salario Big Decimal")

//    Quanto que os funcionarios ganham hoje?

//    Quanto ele vai gastar no proximo mês

//    Quanto ele vai gastar em 6 meses


    regraNegocio()

}


//Criando o Array de Forma Dinâmica
//vararg: parãmetro variável (tipo especial do kotlin que vc consegue passar arumentos variaveis)
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    return Array<BigDecimal>(valores.size) {i ->
        valores[i].toBigDecimal() //Pegando cada valor desse elemnto, acessando pelo indice i e convertendo pra BigDecimal
    }

}

fun exemploEstatico (){
    //    Array com tipo genérico. Para fazer Array do tipo BigDecimal, precisa usar essa estratégia

    val salarios = Array<BigDecimal> (5) { BigDecimal.ONE } //Constante para inializar o Array em Zero

    salarios[0] = "1500.55".toBigDecimal() //Usar string para evitar arredondamento. Depois converter pra BigDecimal
    salarios[1] = "2500.25".toBigDecimal()
    //É preciso converter cada item para o BigDecimal.

    println(salarios.contentToString())

}

fun exemploDinamico(){

    //Usando a função que converte pra BigDecimal de forma dinâmica
    val salariosDinamico = bigDecimalArrayOf("3500.0","2500.0","8500.0","500.0")
    println(salariosDinamico.contentToString())

}


fun regraNegocio(){
    //To.do funcionŕio deve ter um auvmento de 10%. Se o aumento for menor que R$500,00.. cravar o valor em R$ 500,00
    val salarios = bigDecimalArrayOf("3000.0","4000.0","5000.0","6000.0","7000.0")

    //Aumento de 10%
    //Aumento de R$ 500,003
    //Somente dois valores depois da virgula e arrendondar pra cima

    val aumento = "1.1".toBigDecimal() //Aumento de 10%
    val salarioComAumento: Array<BigDecimal> = salarios
//        .map {salarioEmpresa -> (salarioEmpresa * aumento).setScale(2,RoundingMode.UP)} Opção para tudo
        .map { salarioEmpresa ->
            calculaAumentoRelativo(salarioEmpresa, aumento)
        }
        .toTypedArray()







    //Fold (Somatoria)
    //Calculo dos Gastor de todos os salários de 6 meses
//    val meses = 6.toBigDecimal()
//    salarioComAumento.fold()



    println("Salario Atual")
    println(salarios.contentToString())

    println("Somatorio de gastos atuais:")
    println(salarios.somatoria())

    println("")
    println("Salario com Aumento")
    println(salarioComAumento.contentToString())

    println("Somatoria de Salarios com Aumento") //Gastos do primeiro mês de salario com aumento
    val gastoInicial = salarioComAumento.somatoria()
    println(gastoInicial)

    println("Somatoria de Salarios com Aumento por 6 meses") //Gastos do primeiro mês de salario com aumento
    val meses = 6.toBigDecimal()
    //Calculo de somatória com Fold. O fold exige um valor inicial
    val gastoTotal = salarioComAumento.fold(gastoInicial){acumulador, salario->
        acumulador + (salario * meses).setScale(2,RoundingMode.UP)
    }
    println(gastoTotal)


    //Qual é a media dos três maiores salários?


    //Identificar os três maiores salarios
    //> Ordenando do menor pro maior:

    val salariosOrdenados = salarioComAumento.sorted() //Função do Kotlin que ordena do menor parao maior

    println("Ordenação menor pro maior: $salariosOrdenados")
    //Pegar os três primeiros da lista
    println("3 primeiros ${salariosOrdenados.take(3)}")
    //pegar os três ultimos
    println("3 ultimos ${salariosOrdenados.takeLast(3)}")



    //Media dos três maiores salários
    // > extension function
    fun Array<BigDecimal>.media(): BigDecimal {
        return if(this.isEmpty()){
            BigDecimal.ZERO
        }else{
            this.somatoria() / this.size.toBigDecimal()
        }
    }


    //Take last não devolve um array. Transformar em Array BigDecimal
    var tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3).toTypedArray()

    val mediaSalario = tresUltimosSalarios.media()

    //Opção 2
    val mediaMaior = salariosOrdenados
        .sorted() //ordena do menor pro maior
        .takeLast(3) // pega os três ultimos
        .toTypedArray() //converte em array
        .media() //chama a function de media


    val mediaMenor = salariosOrdenados
        .sorted() //ordena do menor pro maior
        .take(3) // pega os três ultimos
        .toTypedArray() //converte em array
        .media() //chama a function de media

    println("Media dos três maiores salarios $mediaSalario")
    println("Media dos três maiores salarios $mediaMaior")
    println("Media dos três menores salarios $mediaMenor")

}

private fun calculaAumentoRelativo(salarioEmpresa: BigDecimal,aumento: BigDecimal)
        = if (salarioEmpresa < "5000.0".toBigDecimal()) {
    salarioEmpresa + "500.0".toBigDecimal()
} else {
    (salarioEmpresa * aumento).setScale(2, RoundingMode.UP)
}


//Extencion Funcion Array  - Somatoria
fun Array<BigDecimal>.somatoria(): BigDecimal{ //reduce: reduce to.do os valores do array à um valor só
    return this.reduce {acumulador, valor ->//o valor é o elemento do array que estamos iterando | o acumulador é a soma de cada iteração
        acumulador + valor
    }
}