package outros

fun estruturaCondicional() {

    println("Estrutura Condicional")

    val idade:Int = 19


    //IF Simples
    if(idade>=18) {
        println("Maior de Idade")}

    //IF Else
    if(idade<=20){
        println("Menor de 20")
    }else {
        println("Maior de 20")
    }


    //IF com Função e retorno direto
    parImpar(6)
}


//IF
fun parImpar(num: Int): String = if (num % 2 == 0) "$num é Par" else "$num é Impar"