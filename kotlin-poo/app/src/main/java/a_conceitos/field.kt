package a_conceitos

class Maquina(var marca: String) {

    var nucleos: Int = 0

        //forçando o get e set com o FIELD
        get() {
            println("Get foi chamado")
            return field
        }
        set(value) {
//            this.nucleos = value
            println("SET foi chamado")
            field = value
        }


}


fun field(){
    var m = Maquina("XPTO")
    println(m.nucleos)
    m.nucleos=1
    println(m.nucleos)
}

fun main(){
    println("teste")
}