package secao28

import java.lang.Exception

class car (val model: String, val maxSpeed: Int){

    var currentSpeed: Int = 0
    set (value){
        if(value>maxSpeed){
            throw Exception("Velocidade maior que a permitida")
        }else{
            field = value //Pesquisar mais sobre o conceito de Field
        }
    }
    get(){
        return field
    }
}

fun main (){
    val c1 = car("Fiat",220)
    c1.currentSpeed = 50

    println(c1.maxSpeed)
    println(c1.currentSpeed)

}
