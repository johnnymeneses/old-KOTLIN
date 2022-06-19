import java.util.*

fun aplicacoes(){

    val str = "Lorem ipsum"

    println(str.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }) //antigo capitalize
    println(str.replaceFirstChar { it.lowercase(Locale.getDefault()) }) //antigo descapitalize

    println(str.contains("bla")) //contem bla?
    println(str.contains("rem")) //contem rem?

    println(str.startsWith("l")) //começa com L?
    println(str.startsWith("l",true)) //Começa com L ignorando a letra maiscula?


    //arrayOf é implementando em vararg com tipo em <T> ou seja, genérico
    arrayOf(1,2,3,5,5)


}

fun <John> teste(vararg valor: John){

}