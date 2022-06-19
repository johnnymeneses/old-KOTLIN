package a_conceitos

//Conceito: Inicialização tardia

//Utilidade: Permite que seja declarado uma variável, sem necessariamente fazer a inicialização.
// Interessante quando existe um método que já usará essa variável e não se quer fazer algo como val n = ‘’


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