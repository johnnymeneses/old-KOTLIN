package secao10

fun parametros() {

//    endereco("Nome Rua","São Paulo","SP","01014000","145")
    endereco(cidade = "São Paulo", estado="SP",cep="54654")

}


//Em alguns casos, as funções podem receber muitos paaremtros. Como lidar com o caso de ser necessário manter
//todos os parametros , mas nao ter todos disponíveis na chamada: receber um valor Default

fun endereco(rua: String="Rua", cidade: String, estado: String, cep: String, numero: String="1515"){
    println("Rua $rua")
    println("Cidade: $cidade, $estado, - $cep")

}
