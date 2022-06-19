package a_conceitos

//Classes seladas: permite que a herança seja feita apenas dentro do mesmo arquivo


sealed class Result {
    class Success(val message: String): Result ()
    class Error(val message: String, val errorCode: Int): Result ()
}

class Repo{
    fun executeS(): Result{
        return Result.Success("Deu certo")
    }

    fun executeE(): Result{
        return Result.Error("Deu ruim",404)
    }
}

fun main(args: Array<String>){

    val r1 = Repo()
    val result: Result = r1.executeE()

    when(result){
        is Result.Success ->{
            println("Sucesso")
        }
        is Result.Error ->{
            println("Ruim")
        }
    }

}
