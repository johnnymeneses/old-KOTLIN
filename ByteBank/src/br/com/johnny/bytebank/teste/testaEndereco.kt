import br.com.johnny.bytebank.modelo.*

fun testaEndereco() {

    val johnCasa = Endereco("Boa Vista",44,"Bela Vista","São Paulo","SP","01014-000")


    val john = Cliente ("johnn","1234578",12345, johnCasa)

    println("Cliente ${john.nome}")
    println("logradouro: ${john.endereco.logradouro}")
    println("numero: ${johnCasa.numero}")
    println("bairro: ${john.endereco.bairro}")
    println("cidade: ${john.endereco.cidade}")
    println("estado: ${john.endereco.estado}")
    println("CEP: ${john.endereco.cep}")




}


