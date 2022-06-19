package c_orientacaoObjeto

//Inicializando as variaveis para deixar elas como nao obrigatorias
//É válido ressaltar que para ser um parâmetro opcional, não é necessário o uso do var.
class Endereco (
    var logradouro: String ="",
    val numero: Int= 0,
    var bairro: String ="",
    var cidade: String ="",
    var estado: String ="",
    var cep: String="",
    var complemento: String="" )  {

    //Sobscrita de toString [toString personalizado] Bom pra ver o que mudou no ojbeto.
    override fun toString(): String {
        return "logradouro: $logradouro, numero: $numero"
    }

    //Sobscrita de equals gerado pelo Kotlin
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (logradouro != other.logradouro) return false
        if (numero != other.numero) return false
        if (bairro != other.bairro) return false
        if (cidade != other.cidade) return false
        if (estado != other.estado) return false
        if (cep != other.cep) return false
        if (complemento != other.complemento) return false

        return true
    }

    //Sobscrita de hashCode gerado pelo Kotlin
    override fun hashCode(): Int {
        var result = logradouro.hashCode()
        result = 31 * result + numero
        result = 31 * result + bairro.hashCode()
        result = 31 * result + cidade.hashCode()
        result = 31 * result + estado.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + complemento.hashCode()
        return result
    }


}
