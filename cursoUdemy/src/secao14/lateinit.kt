///Inicializacao taria

//Permite que eu declare uma variavel e nao necessariamente faça a inicialização dela... seja com valor aleatorio ou com valor vazio
class Pessoa{

    //Property must be initialized or be abstract (sem o lateinit)
    lateinit var nome: String


    fun geradorDeNome(){
        nome = "eoeoekoke"
    }

}

fun iniciaTardia() {

    val p = Pessoa()
    p.geradorDeNome()
}