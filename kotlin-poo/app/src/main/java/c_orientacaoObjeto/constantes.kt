package c_orientacaoObjeto

class constantes {
}


//classes com o modificador static não precisam ser instanciadas
//Exemplo Math
//Kotlin: Companion Object e Object


//Metodo sai do escopo da instância da classe e entra no escopo da classe em si

class Constants{
    companion object Banco {  //Pode ou nao ter um nome
        val TABLE = "Pessoa"

        fun imprimeMesa(){
            println("Mesa no Companion Objects")
        }
    }

    object VENDAS{
        val TABLE_NAME = "Vendas"

        object COLUNAS {
            val ID="ID"
            val TOTAL = "Total"
        }

    }




    fun imprimeMesa2(){
        println("Mesa fora do  Companion Objects")
    }

}


fun variaveisEstaticas(){

    Math.sin(180.0)

    println(Constants.TABLE) //acessando diretamente a variavel Table sem instanciar a classe Constant
    Constants.imprimeMesa()

    println("mesma chamada.. mas com nome")
    Constants.Banco.imprimeMesa()


    val mesa = Constants()
//        Constants.imprimeMesa2()
    mesa.imprimeMesa2() //Para o método fora do companion Objects, é necessario instanciar uma classe




    println(Constants.VENDAS.COLUNAS.ID)
    println(Constants.VENDAS.COLUNAS.TOTAL)



}