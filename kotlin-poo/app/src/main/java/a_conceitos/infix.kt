package a_conceitos


//Infix melhorar a leitura da funcao

class Person(val name: String){
    infix fun isName(value: String): Boolean{
        return value==name
    }
}

fun main(){
    val john = Person("Johnny")

    println(john.isName("Johnny"))

    println(john isName "Johnny") //infix

}

